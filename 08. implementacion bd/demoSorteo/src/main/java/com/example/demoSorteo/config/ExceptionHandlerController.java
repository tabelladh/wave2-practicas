package com.example.demoSorteo.config;

import com.example.demoSorteo.dto.ErrorDTO;
import com.example.demoSorteo.dto.ExcepcionDTO;
import com.example.demoSorteo.exceptions.registroInexistenteException;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.stream.Collectors;

@ControllerAdvice
public class ExceptionHandlerController {

    // MANEJADOR DE EXCEPCION //
    @ExceptionHandler(registroInexistenteException.class)
    public ResponseEntity<?> registroNotFound(Exception e){
        ExcepcionDTO excepcion = new ExcepcionDTO("Registro inexistente", 404);
        return new ResponseEntity<>(excepcion, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ExcepcionDTO> dataIntegrityViolationException(DataIntegrityViolationException e){
        ExcepcionDTO excepcion = new ExcepcionDTO("El registro que intenta guardar ya existe", 409);
        return new ResponseEntity<>(excepcion, HttpStatus.CONFLICT);
    }

    ///////////////////////////////////////////////
    /// MANEJADOR DE VALIDACIONES ////////////////

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDTO> validationException(MethodArgumentNotValidException e){
        return ResponseEntity.badRequest().body(
                new ErrorDTO("Se encontraron los siguientes errores en las validaciones: @Valid del DTO",
                        e.getAllErrors().stream()
                                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                                .collect(Collectors.toList())
                )
        );
    }

//    @ExceptionHandler(ConstraintViolationException.class)
//    public ResponseEntity<ErrorDTO> validationException(ConstraintViolationException e){
//        return ResponseEntity.badRequest().body(
//                new ErrorDTO("Se encontraron los siguientes errores en las validaciones en el PathVariable y RequestParam ",
//                        e.getConstraintViolations().stream()
//                                .map(DefaultMessageSourceResolvable::getDefaultMessage)
//                                .collect(Collectors.toList())
//                )
//        );
//    }




}

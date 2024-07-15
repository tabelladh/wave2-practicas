# Agencia de Turismo API

## Descripción

# Proyecto de Gestión de Reservas de Vuelos y Hoteles

Este proyecto es una aplicación de gestión de reservas de vuelos y hoteles que permite a los usuarios crear y gestionar sus reservas. Además, la aplicación ofrece la funcionalidad de paquetes turísticos, que incluyen combinaciones de reservas de vuelos y hoteles con un descuento especial.


## Funcionalidades

1. Gestión de Vuelos:
- Crear, leer, actualizar y eliminar reservas de vuelos.
- Consultar detalles de vuelos disponibles.
- Búsqueda de vuelos por diferentes criterios (Ej., destino, fecha).

2. Gestión de Hoteles:
- Crear, leer, actualizar y eliminar reservas de hoteles.
- Consultar detalles de hoteles disponibles.
- Búsqueda de hoteles por diferentes criterios (Ej., ubicación, disponibilidad).

3. Paquetes Turísticos:
- Crear, leer, actualizar y eliminar paquetes turísticos.
- Cada paquete turístico incluye una combinación de dos reservas (vuelos y/o hoteles).
- Aplicación automática de un descuento del 10% en el precio total del paquete.

4. Generación de Reportes:
- Reportes de ingresos diarios y mensuales.
- Top 3 clientes con más reservas en el año.
- Consultas personalizadas sobre reservas y clientes.

## Tecnologías Utilizadas

* Backend:
  - Lenguaje: Java
  - Framework: Spring Boot
  - Persistencia: JPA con Hibernate

* IDE:
  - IntelliJ IDEA

* Herramientas Adicionales:
  - Postman para pruebas de la API

## Estructura del Proyecto

El proyecto está organizado en varios módulos, cada uno responsable de una parte específica de la funcionalidad:

* Controller: Maneja las solicitudes HTTP y delega las operaciones al servicio correspondiente.
* Service: Contiene la lógica de negocio y se comunica con el repositorio.
* Repository: Interactúa con la base de datos utilizando JPA/Hibernate.
* Model: Define las entidades y sus relaciones.
* DTO (Data Transfer Object): Define los objetos que se utilizan para transferir datos entre las capas de la aplicación, simplificando las interacciones y asegurando que sólo la información necesaria se transmita entre las capas.


## Endpoints

## Uso de la API

### Gestión de Clientes

- *Top 3 Clientes*
  - Método: GET
  - Endpoint: /api/v1/clients/top3

- *Listar Clientes*
  - Método: GET
  - Endpoint: /api/v1/clients

### Gestión de Vuelos

- *Listar Todos los Vuelos*
  - Método: GET
  - Endpoint: /api/v1/flights

- *Vuelos Disponibles*
  - Método: GET
  - Endpoint: /api/v1/flights/flights
  - Parámetros:
    - dateFrom: Fecha de inicio (formato: dd-MM-yyyy)
    - dateTo: Fecha de fin (formato: dd-MM-yyyy)
    - origin: Origen del vuelo
    - destination: Destino del vuelo

- *Crear Vuelo*
  - Método: POST
  - Endpoint: /api/v1/flights/new

- *Actualizar Vuelo*
  - Método: PUT
  - Endpoint: /api/v1/flights/edit/{id}

- *Eliminar Vuelo*
  - Método: DELETE
  - Endpoint: /api/v1/flights/delete/{id}

### Gestión de Reservas de Vuelos

- *Listar Reservas de Vuelos*
  - Método: GET
  - Endpoint: /api/v1/flight-booking

- *Crear Reserva de Vuelo*
  - Método: POST
  - Endpoint: /api/v1/flight-booking/new

- *Actualizar Reserva de Vuelo*
  - Método: PUT
  - Endpoint: /api/v1/flight-booking/edit/{id}

- *Eliminar Reserva de Vuelo*
  - Método: DELETE
  - Endpoint: /api/v1/flight-booking/delete/{id}

### Gestión de Hoteles

- *Listar Todos los Hoteles*
  - Método: GET
  - Endpoint: /api/v1/hotels

- *Crear Hotel*
  - Método: POST
  - Endpoint: /api/v1/hotels/new

- *Actualizar Hotel*
  - Método: PUT
  - Endpoint: /api/v1/hotels/edit/{id}

- *Eliminar Hotel*
  - Método: DELETE
  - Endpoint: /api/v1/hotels/delete/{id}

- *Hoteles Disponibles*
  - Método: GET
  - Endpoint: /api/v1/hotels/hotels-available
  - Parámetros:
    - dateFrom: Fecha de inicio (formato: dd-MM-yyyy)
    - dateTo: Fecha de fin (formato: dd-MM-yyyy)
    - destination: Destino del hotel
    - hotelCode: Código del hotel

### Gestión de Reservas de Hoteles

- *Listar Reservas de Hoteles*
  - Método: GET
  - Endpoint: /api/v1/hotel-booking

- *Crear Reserva de Hotel*
  - Método: POST
  - Endpoint: /api/v1/hotel-booking/new

- *Actualizar Reserva de Hotel*
  - Método: PUT
  - Endpoint: /api/v1/hotel-booking/edit/{id}

- *Eliminar Reserva de Hotel*
  - Método: DELETE
  - Endpoint: /api/v1/hotel-booking/delete/{id}


### Gestión de Paquetes Turísticos

- *Crear Paquete Turístico (Hotel)*
  - Método: POST
  - Endpoint: /api/v1/touristicpackage/hotel/new

- *Crear Paquete Turístico (Vuelo)*
  - Método: POST
  - Endpoint: /api/v1/touristicpackage/flight/new

### Listado de reservas

- *Listar Reservas*
  - Método: GET
  - Endpoint: /api/v1/income

- *Listar Reservas por Día*
  - Método: GET
  - Endpoint: /api/v1/income/dia
  - Parámetro: dia


- *Listar Reservas por Mes*
  - Método: GET
  - Endpoint: /api/v1/income/mes
  - Parámetro: mes


## Ejecución de Pruebas

Para probar la API, se recomienda usar Postman. Se pueden importar las colecciones de Postman para facilitar las pruebas de los diferentes endpoints.


## Excepciones Implementadas

- **InvalidFlightReservationException:** Se lanza cuando no se encuentra ningún vuelo que coincida con los criterios de reserva proporcionados. Esto puede ocurrir cuando las fechas, origen o destino no coinciden con ningún vuelo disponible.
- **InvalidReservationException:** Se lanza cuando se produce un error durante la reserva de un vuelo  o un hotel. Por ejemplo, cuando intentan reservar una oferta ya reservada, proporcionar un número de cuotas de pago no válido o no encontrar un hotel o vuelo que coincida con los criterios de búsqueda..
- **InvalidHotelReservationException:** Se lanza cuando no se encuentra ningún hotel que coincida con los criterios de reserva proporcionados. Esto puede suceder cuando las fechas o el destino no coinciden con ningún hotel disponible.
- **InvalidConsultDateException:** Se lanza cuando se proporciona una fecha de consulta incorrecta, como una fecha en un formato no válido o una fecha de finalización anterior a la fecha de inicio.
- **IllegalArgumentException:** Se lanza devolviendo al cliente una respuesta de formato DTO. 

## Miembros del Equipo y Responsabilidades

- Agustina Peralta: Implementación de la funcionalidad para la reserva de hoteles (US 0003), incluyendo la validación de datos de entrada y el manejo de excepciones específicas.
- Germán Poupeau: Implementación de la funcionalidad para listar todos los hoteles registrados (US 0001), asegurando que se obtengan y devuelvan correctamente los datos de los hoteles.
- Matías Leglise: Implementación de la funcionalidad para realizar reservas de vuelos (US 0006), incluyendo la lógica de negocio y la validación de reservas.
- Joaquín Cassina: Implementación de la funcionalidad para listar vuelos disponibles (US 0005), manejando la búsqueda por fechas y destinos.
- Juan Manuel Francesconi: Implementación de la funcionalidad para listar todos los vuelos registrados (US 0004), garantizando la correcta recuperación y formato de los datos de vuelos.
- Andrea Toledo: Implementación de la funcionalidad para buscar hoteles disponibles en un rango de fechas y destino específico (US 0002), gestionando la lógica de búsqueda y filtrado.

## Decisiones de Grupo

Durante el desarrollo del proyecto, el equipo tomó las siguientes decisiones:

- Utilizar Spring Boot para el desarrollo de la API debido a su facilidad de configuración y su amplia integración con Spring Framework.
- Implementar un controlador de excepciones global (ExecptionController) para manejar las excepciones de manera centralizada y devolver respuestas HTTP adecuadas.

## Ubicación de la Colección en el Proyecto

La colección de la API se encuentra en el directorio collections en la raíz del proyecto.

## Validaciones

### Hoteles

#### US 0002: Obtener un listado de todos los hoteles disponibles
#### US 0005: Obtener un listado de todos los vuelos disponibles

**Parámetros:**

- **Fecha Entrada:**
  - **Validaciones:**
    - Formato correcto (dd-mm-aaaa).
    - La fecha de entrada debe ser menor a la de salida.
  - **Mensajes de error:**
    - "Formato de fecha debe ser dd-mm-aaaa".
    - "La fecha de entrada debe ser menor a la de salida".

- **Fecha Salida:**
  - **Validaciones:**
    - Formato correcto (dd-mm-aaaa).
    - La fecha de salida debe ser mayor a la de entrada.
  - **Mensajes de error:**
    - "Formato de fecha debe ser dd-mm-aaaa".
    - "La fecha de salida debe ser mayor a la de entrada".

**Se creó el método dateValid, que verifica que la fecha de entrada sea menor a la de salida**

- **Destino:**
  - **Validaciones:**
    - El destino debe existir.
  - **Mensaje de error:**
    - "El destino elegido no existe"
      **Se creó un método que valida que el destino enviado exista.**
    - **US005: Se creó un método que valida que el destino y origen enviado exista.**

#### US 0003: Realizar una reserva de hotel
#### US 0006: Realizar una reserva de vuelo

**Parámetros:**

- **Fecha Entrada:**
  - **Validaciones:**
    - Formato correcto (dd-mm-aaaa).
    - La fecha de entrada debe ser menor a la de salida.
  - **Mensajes de error:**
    - "Formato de fecha debe ser dd-mm-aaaa"
    - "La fecha de entrada debe ser menor a la de salida"

- **Fecha Salida:**
  - **Validaciones:**
    - Formato correcto (dd-mm-aaaa).
    - La fecha de salida debe ser mayor a la de entrada.
  - **Mensajes de error:**
    - "Formato de fecha debe ser dd-mm-aaaa"
    - "La fecha de salida debe ser mayor a la de entrada"

- **Destino:**
  - **Validaciones:**
    - El destino debe existir.
  - **Mensaje de error:**
    - "El destino elegido no existe"


- **Cantidad de Personas:**
  - **Validaciones:**
    - Debe ser un valor numérico.
  - **Mensaje de error:**
    - "La cantidad de personas debe ser un valor numérico."

- **Tipo de Habitación:**
  - **Validaciones:**
    - Debe coincidir con la cantidad de personas.
  - **Mensaje de error:**
    - "El tipo de habitación seleccionada no coincide con la cantidad de personas que se alojarán en ella."

**Se creó un método (roomCapacity) que valida que la cantidad de personas coincida con el tipo de habitación.**
**US005: Se creó un método que valida que la cantidad de personas coincida con la cantidad de asientos.**

- **E-mail:**
  - **Validaciones:**
    - Debe cumplir con el formato de correo electrónico (nombre@dominio.com).
  - **Mensaje de error:**
    - "Por favor ingrese un e-mail válido".

- **Intereses:**
  - **Validaciones:**
    - En caso de tarjeta de crédito, verificar recargo de intereses según el número de cuotas.
    - En caso de tarjeta de débito, verificar que no se incorporen intereses y que se permita el pago en una sola cuota.
  - **Mensajes:**
    - Tarjeta de crédito: Devolver porcentaje y monto de interés (recargo).
    - Tarjeta de débito: Informar que se ha ingresado una cantidad de cuotas diferente a 1.

  **Se creó un método (calcInterest) que valida los tipos de pago e intereses correspondientes.**




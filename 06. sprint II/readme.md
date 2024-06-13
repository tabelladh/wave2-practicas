# Sprint_1_Equipo_4
https://github.com/leobolatti15/Sprint_1_Equipo_4

La colección del proyecto se encuentra en la carpeta resources

## Descripción
Se implementó una API REST para dar solución a un problema planteado por una agencia de turismo, que desea recibir solicitudes de reserva de hoteles y vuelos. 
Se cuenta con datos de cada uno de ellos y requerimientos mínimos: 

- Hoteles
  
US 0001: Obtener un listado de todos los hoteles registrados

US 0002: Obtener un listado de todos los hoteles disponibles en un determinado rango de fechas y según el destino seleccionado. 

US 0003: Realizar una reserva de un hotel, indicando cantidad de personas, fecha de entrada, fecha de salida y tipo de habitación. Obtener como respuesta el monto total de la reserva realizada.

- Vuelos
  
US 0004: Obtener un listado de todos los vuelos registrados.

US 0005: Obtener un listado de todos los vuelos disponibles en un determinado rango de fechas y según el destino y el origen seleccionados.

US 0006: Realizar una reserva de un vuelo, indicando cantidad de personas, origen, destino y fecha de ida. Obtener como respuesta el monto total de la reserva realizada.


## Miembros del equipo y responsables de cada tarea
Todos los miembros: US-0001

HOTELES:
- Francisco Alegre: US-0002 / Crud: create y delete
- Macarena Ruffa: US-0003 / Crud: findByCode y update
  
VUELOS:
- Josefina Eberhardt: US-0004 y US-0005 / Crud: findByNumber y delete
- Matias Oggero: US-0006 / Crud: create y update
  
EXCEPCIONES: 
- Leonardo Bolatti. Se realizaron 2 excepciones:
  1) Fecha fuera de rango: fecha fuera del rango de reserva o fecha dateFrom es posterior a dateTo
  2) Pedido sin parámetros: falta alguno de: dateTo, dateFrom, origin, destination. Si faltan todos se mantiene la respuesta de lista completa de hoteles/vuelos.

## Decisiones grupales
Se resolvieron conflictos en grupo al integrar cada historia de usuario.

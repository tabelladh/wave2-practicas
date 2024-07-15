# Sprint_1_Equipo_4
https://github.com/leobolatti15/Sprint_1_Equipo_4

La colección del proyecto se encuentra en la carpeta resources
El documento de daily meeting se encuentra en la rama develop

# Sprint 1:
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

# SPRINT 2:

Se realizaron test unitarios y de integración. Todas las actividades se realizaron de manera grupal.

# SPRINT 3: 

Se adapta el proyecto e integra a base de datos relacional, con el uso de MySQL, H2, y consultas HQL

# Requerimiento 1: Realizado por Matias Oggero

POST /api/v1/hotels/new/ Alta de un nuevo hotel

POST /api/v1/flights/new Alta de un nuevo vuelo

POST /api/v1/hotel-booking/new Alta de una reserva de hotel

POST /api/v1/flight-reservation/new Alta de una reserva de vuelo

PUT /api/v1/flights/edit?flightNumber=number Modificación de un vuelo

PUT /api/v1/hotels/edit?hotelCode=code Modificación de un hotel

PUT /api/v1/hotel-booking/edit?id=num_id Modificación de una reserva de hotel

PUT /api/v1/flight-reservation/edit?id=num_id Modificación de una reserva de vuelo

GET /api/v1/hotels Listado de todos los hoteles

GET /api/v1/hotels?dateFrom=dd/mm/aaaa&dateTo=dd/mm/aaaa&destination=destination_name Listado de hoteles según filtros

GET /api/v1/flights Listado de todos los vuelos

GET /api/v1/flights?dateFrom=dd/mm/aaaa&dateTo=dd/mm/aaaa&origin=origin_name&destination=destination_name

GET /api/v1/hotel-bookings/ Listado de todas las reservas de hotel

GET /api/v1/flight-reservations/ Listado de todas las reservas de vuelos

DELETE /api/v1/hotels/delete?hotelCode=code Baja de un hotel

DELETE /api/v1/flights/delete?flightNumber=number Baja de un vuelo

DELETE /api/v1/hotel-booking/delete?id=num_id

DELETE /api/v1/flight-reservation/delete?id=num_id Baja de una reserva de vuelo

# Requerimiento 2: Leonardo Bolatti

La agencia de viajes y turismo desea empezar a implementar el armado de paquetes turísticos; para esto, especificó que cada paquete turístico podrá estar conformado de la siguiente manera: Dos reservas de vuelos. Dos reservas de hotel. Una reserva de vuelo y una reserva de hotel
Los paquetes turísticos ofrecen como beneficio al cliente, un descuento del 10% sobre el valor total de la sumatoria de los dos ítems que tenga incorporado. Por ejemplo: Si se tiene una reserva de vuelo por $30.000 y una reserva de hotel por $15.000, la sumatoria total es de $45.000. Si aplicamos el descuento del 10% tendremos $45.000 - $4500, por lo que el precio total del paquete sería de $40.500.

POST /api/v1/touristicpackage/new/ Alta de un nuevo paquete

PUT /api/v1/touristicpackage/edit?packageNumber=number Modificación de un paquete

GET /api/v1/touristicpackages Listado de todos los paquetes dados de alta

DELETE /api/v1/touristicpackage/delete?packageNumber=number Baja de un paquete

# Requerimiento 3: Josefina Eberhardt

El dueño de la agencia de turismo manifestó la necesidad de conocer los montos brutos totales que ingresan en un determinado día o mes a partir de cada una de las reservas realizadas. Para ello solicita que sus empleados sean capaces de realizar consultas por día o mes y brindarle dicha información.

GET /api/v1/income?date=dd/mm/yyyy Total de ingresos brutos para un día en particular  a partir de reservas

GET /api/v1/income?month=1&year=2021 Total de ingresos brutos para un mes y año en particular  a partir de reservas

# Requerimiento 4: Macarena Ruffa

Para la agencia de turismo es muy importante poder premiar a sus mejores clientes. Para ello, desea poder conocer el “top 3” de clientes que hayan realizado mayor cantidad de reservas en un determinado año.

GET /api/v1/clients/top-3 Listado del top 3 de clientes en base a cantidad de reservas realizadas

Si bien se dividieron las tareas, nos brindamos soporte entre los integrantes del equipo.


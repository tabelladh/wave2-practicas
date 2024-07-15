-- Insertando el primer hotel
INSERT INTO hotels (hotel_code, name, destination, room_type, price_per_night, date_from, date_to, reserved)
VALUES ('CH-0002', 'Cataratas Hotel', 'Puerto Iguazu', 'Double', 6300, '2025-02-10', '2025-03-20', 0);

-- Insertando el segundo hotel
INSERT INTO hotels (hotel_code, name, destination, room_type, price_per_night, date_from, date_to, reserved)
VALUES ('CH-0003', 'Cataratas Hotel 2', 'Puerto Iguazu', 'Triple', 8200, '2025-02-10', '2025-03-23', 0);

-- Insertando el tercer hotel
INSERT INTO hotels (hotel_code, name, destination, room_type, price_per_night, date_from, date_to, reserved)
VALUES ('HB-0001', 'Hotel Bristol', 'Buenos Aires', 'Single', 5435, '2025-02-10', '2025-03-19', 1);

-- Insertando el cuarto hotel
INSERT INTO hotels (hotel_code, name, destination, room_type, price_per_night, date_from, date_to, reserved)
VALUES ('BH-0002', 'Hotel Bristol 2', 'Buenos Aires', 'Double', 7200, '2025-02-12', '2025-04-17', 0);

-- Insertando el quinto hotel
INSERT INTO hotels (hotel_code, name, destination, room_type, price_per_night, date_from, date_to, reserved)
VALUES ('MA-0001', 'Mar del Plata Inn', 'Mar del Plata', 'Suite', 9500, '2025-02-15', '2025-03-25', 0);

-- Insertando el sexto hotel
INSERT INTO hotels (hotel_code, name, destination, room_type, price_per_night, date_from, date_to, reserved)
VALUES ('MA-0002', 'Mar del Plata Inn 2', 'Mar del Plata', 'Double', 6100, '2025-02-15', '2025-03-28', 1);

-- Insertando el séptimo hotel
INSERT INTO hotels (hotel_code, name, destination, room_type, price_per_night, date_from, date_to, reserved)
VALUES ('CB-0001', 'Cordoba Boutique', 'Cordoba', 'Single', 4800, '2025-02-18', '2025-03-22', 0);

-- Insertando el octavo hotel
INSERT INTO hotels (hotel_code, name, destination, room_type, price_per_night, date_from, date_to, reserved)
VALUES ('CB-0002', 'Cordoba Boutique 2', 'Cordoba', 'Triple', 7500, '2025-02-18', '2025-03-24', 0);

-- Insertando el noveno hotel
INSERT INTO hotels (hotel_code, name, destination, room_type, price_per_night, date_from, date_to, reserved)
VALUES ('BA-0003', 'Buenos Aires Grand', 'Buenos Aires', 'Suite', 12000, '2025-02-20', '2025-04-15', 1);

-- Insertando el décimo hotel
INSERT INTO hotels (hotel_code, name, destination, room_type, price_per_night, date_from, date_to, reserved)
VALUES ('MD-0001', 'Mendoza Resort', 'Mendoza', 'Single', 5300, '2025-02-22', '2025-03-20', 0);

-- Insertando el primer vuelo
INSERT INTO flights (flight_code, origin, destination, seat_type, price_per_person, date_from, date_to)
VALUES ('BAPI-1235', 'Buenos Aires', 'Puerto Iguazu', 'Economy', 6500, '2025-02-10', '2025-02-15');

-- Insertando el segundo vuelo
INSERT INTO flights (flight_code, origin, destination, seat_type, price_per_person, date_from, date_to)
VALUES ('PIBA-1420', 'Puerto Iguazu', 'Bogota', 'Business', 43200, '2025-02-10', '2025-02-20');

-- Insertando el tercer vuelo
INSERT INTO flights (flight_code, origin, destination, seat_type, price_per_person, date_from, date_to)
VALUES ('PIBA-1420', 'Puerto Iguazu', 'Bogota', 'Economy', 25735, '2025-02-10', '2025-02-21');

-- Insertando el cuarto vuelo
INSERT INTO flights (flight_code, origin, destination, seat_type, price_per_person, date_from, date_to)
VALUES ('BATU-5536', 'Buenos Aires', 'Tucuman', 'Economy', 7320, '2025-02-10', '2025-02-17');

-- Insertando el quinto vuelo
INSERT INTO flights (flight_code, origin, destination, seat_type, price_per_person, date_from, date_to)
VALUES ('CORJ-4311', 'Cordoba', 'Jujuy', 'Business', 19250, '2025-02-11', '2025-02-18');

-- Insertando el sexto vuelo
INSERT INTO flights (flight_code, origin, destination, seat_type, price_per_person, date_from, date_to)
VALUES ('RGAU-6712', 'Rio Gallegos', 'Ushuaia', 'Economy', 8450, '2025-02-12', '2025-02-19');

-- Insertando el séptimo vuelo
INSERT INTO flights (flight_code, origin, destination, seat_type, price_per_person, date_from, date_to)
VALUES ('SAFS-3921', 'Salta', 'San Fernando del Valle de Catamarca', 'Economy', 6750, '2025-02-13', '2025-02-20');

-- Insertando el octavo vuelo
INSERT INTO flights (flight_code, origin, destination, seat_type, price_per_person, date_from, date_to)
VALUES ('BAME-2490', 'Buenos Aires', 'Mendoza', 'Business', 15800, '2025-02-14', '2025-02-21');

-- Insertando el noveno vuelo
INSERT INTO flights (flight_code, origin, destination, seat_type, price_per_person, date_from, date_to)
VALUES ('CORB-8932', 'Cordoba', 'Bariloche', 'Economy', 12900, '2025-02-15', '2025-02-22');

-- Insertando el décimo vuelo
INSERT INTO flights (flight_code, origin, destination, seat_type, price_per_person, date_from, date_to)
VALUES ('RESS-7123', 'Resistencia', 'Santiago del Estero', 'Economy', 7900, '2025-02-16', '2025-02-23');


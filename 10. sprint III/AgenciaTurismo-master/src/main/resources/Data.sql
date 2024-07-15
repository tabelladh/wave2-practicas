INSERT INTO hotels (hotel_code, hotel_name, destination, room_type, price_for_night, date_from, date_to, reserved)
VALUES
('CH-0002', 'Cataratas Hotel', 'Puerto Iguazú', 'Doble', 6300, '2025-02-10', '2025-03-20', 0),
('CH-0003', 'Cataratas Hotel 2', 'Puerto Iguazú', 'Triple', 8200, '2025-02-10', '2025-03-23', 0),
('HB-0001', 'Hotel Bristol', 'Buenos Aires', 'Single', 5435, '2025-02-10', '2025-03-19', 0),
('BH-0002', 'Hotel Bristol 2', 'Buenos Aires', 'Doble', 7200, '2025-02-12', '2025-04-17', 0),
('SH-0002', 'Sheraton', 'Tucumán', 'Doble', 5790, '2025-04-17', '2025-05-23', 0),
('SH-0001', 'Sheraton 2', 'Tucumán', 'Single', 4150, '2025-01-02', '2025-02-19', 0),
('SE-0001', 'Selina', 'Bogotá', 'Single', 3900, '2025-01-23', '2025-11-23', 0),
('SE-0002', 'Selina 2', 'Bogotá', 'Doble', 5840, '2025-01-23', '2025-10-15', 0),
('EC-0003', 'El Campín', 'Bogotá', 'Triple', 7020, '2025-02-15', '2025-03-27', 0),
('CP-0004', 'Central Plaza', 'Medellín', 'Múltiple', 8600, '2025-03-01', '2025-04-17', 0),
('CP-0002', 'Central Plaza 2', 'Medillín', 'Doble', 6400, '2025-02-10', '2025-03-20',0),
('BG-0004', 'Bocagrande', 'Cartagena', 'Múltiple', 9370, '2025-04-17', '2025-06-12', 0);

INSERT INTO flights (flight_code, origin, destination, seat_type, price, date_from, date_to, reserved)
VALUES
('BAPI-1235', 'Buenos Aires', 'Puerto Iguazú', 'Economy', 6500, '2025-02-10', '2025-02-15',0),
('PIBA-1420', 'Puerto Iguazú', 'Bogotá', 'Business', 43200, '2025-02-10', '2025-02-20',0),
('PIBA-1420', 'Puerto Iguazú', 'Bogotá', 'Economy', 25735, '2025-02-10', '2025-02-20',0),
('BATU-5536', 'Buenos Aires', 'Tucumán', 'Economy', 7320, '2025-02-10', '2025-02-17',0),
('TUPI-3369', 'Tucumán', 'Puerto Iguazú', 'Business', 12530, '2025-02-12', '2025-02-23',0),
('TUPI-3369', 'Tucumán', 'Puerto Iguazú', 'Economy', 5400, '2025-02-12', '2025-02-23',0),
('BOCA-4213', 'Bogotá', 'Cartagena', 'Economy', 8000, '2025-01-23', '2025-02-05',0),
('CAME-0321', 'Cartagena', 'Medellín', 'Economy', 7800, '2025-01-23', '2025-01-31',0),
('BOBA-6567', 'Bogotá', 'Buenos Aires', 'Business', 57000, '2025-02-15', '2025-02-28',0),
('BOBA-6567', 'Bogotá', 'Buenos Aires', 'Economy', 39860, '2025-02-15', '2025-02-28',0),
('BOME-4442', 'Bogotá', 'Medellín', 'Economy', 11000, '2025-02-10', '2025-02-24',0),
('MEPI-9986', 'Medellín', 'Puerto Iguazú', 'Business', 41640, '2025-04-17', '2025-05-02',0);

INSERT INTO clients (booking_quantity, year, email,first_name, last_name, password, username, role)
VALUES
(0, 2024, "gerpoupeau@gmail.com","German", "Poupeau", "Vamo River", "gerpoupeau", "CLIENTE"),
(0, 2024, "juanma@gmail.com", "Juan", "Francesconi", "juanma13", "jfrancesco", "CLIENTE"),
(0, 2024, "rikiford@gmail.com", "Ricardo", "Ford", "miamee", "rikiford99", "ADMIN"),
(0, 2024, "agus@gmail.com", "Agustina", "Peralta", "123456", "aguperalta", "CLIENTE"),
(0, 2024, "andrea@gmail.com", "Andrea", "Toledo", "contraseña", "andretoledo", "CLIENTE"),
(0, 2024, "matias@gmail.com", "Matias", "Leglise", "mati2000", "matileglise", "CLIENTE"),
(0, 2024, "joaco@gmail.com", "Joaquin", "Cassina", "limon20", "joacassina", "CLIENTE");

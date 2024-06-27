INSERT INTO autores (id_autores, nombre, nacionalidad) VALUES
(1, 'J.K. Rowling', 'británica'),
(2, 'Valerie Stimac', 'estadounidense'),
(3, 'Italo Calvino', 'italiana'),
(4, 'Marcel Proust', 'francesa'),
(5, 'Mark A. Garlick', 'británico');

INSERT INTO libros (id_libros, titulo, editorial, area) VALUES
(1, 'Harry Potter y la piedra filosofal', 'Salvatore', 'Fantasía'),
(2, 'Animales fantásticos y dónde encontrarlos', 'Salamandra', 'Fantasía'),
(3, 'El Universo: Guía de viaje', 'National Geographi', 'cientifico'),
(4, 'Fundamentos de Bases de Datos', 'TechBooks', 'Base de datos'),
(5,'Redes y Protocolos de Internet', 'WebBooks', 'Internet');

INSERT INTO libros_autores (id_autores, id_libros) VALUES
(1, 1),
(1, 2),
(2, 3),
(5, 3);


INSERT INTO estudiantes (id_lector, nombre, apellido, direccion, carrera, edad) VALUES
(1, 'Juan', 'Perez', 'Calle A #123', 'Informática', 22),
(2, 'Filippo', 'Galli', 'Av. B #456', 'Medicina', 31),
(3, 'Luis', 'Martínez', 'Calle C #789', 'Informática', 27),
(4, 'Ana', 'López', 'Av. D #012', 'Derecho', 20),
(5, 'Carlos', 'Gómez', 'Calle E #345', 'Informática', 23);

INSERT INTO prestamos (id, id_lector, id_libros, fecha_prestamo, fecha_devolucion, devuelto) VALUES
(1, 1, 4, '2024-01-05', '2024-01-15', 1),
(2, 2, 1, '2024-02-10', '2024-02-20', 1),
(3, 2, 2, '2024-06-15', '2024-07-25', 0),
(4, 3, 5, '2024-04-20', '2024-05-01', 1),
(5, 5, 4, '2024-05-25', '2024-06-30', 0);


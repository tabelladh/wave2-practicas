CREATE DATABASE IF NOT EXISTS Biblioteca;
USE Biblioteca;

-- Creación de la tabla AUTOR
CREATE TABLE AUTOR (
    idAutor INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(255) NOT NULL,
    Nacionalidad VARCHAR(100)
);

-- Creación de la tabla LIBRO
CREATE TABLE LIBRO (
    idLibro INT AUTO_INCREMENT PRIMARY KEY,
    Título VARCHAR(255) NOT NULL,
    Editorial VARCHAR(255),
    Area VARCHAR(100)
);

-- Creación de la tabla ESTUDIANTE
CREATE TABLE ESTUDIANTE (
    idLector INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(255) NOT NULL,
    Apellido VARCHAR(255) NOT NULL,
    Dirección VARCHAR(255),
    Carrera VARCHAR(100),
    Edad INT
);

-- Creación de la tabla LIBROAUTOR
CREATE TABLE LIBROAUTOR (
    idAutor INT,
    idLibro INT,
    PRIMARY KEY (idAutor, idLibro),
    FOREIGN KEY (idAutor) REFERENCES AUTOR(idAutor),
    FOREIGN KEY (idLibro) REFERENCES LIBRO(idLibro)
);

-- Creación de la tabla PRESTAMO
CREATE TABLE PRESTAMO (
    idLector INT,
    idLibro INT,
    FechaPrestamo DATE,
    FechaDevolucion DATE,
    Devuelto BOOLEAN,
    PRIMARY KEY (idLector, idLibro, FechaPrestamo),
    FOREIGN KEY (idLector) REFERENCES ESTUDIANTE(idLector),
    FOREIGN KEY (idLibro) REFERENCES LIBRO(idLibro)
);


-- Ahora insertaremos datos dentro de esas tablas para poder hacer las queries correspondientes
-- Insertar datos en la tabla AUTOR
INSERT INTO AUTOR (Nombre, Nacionalidad) VALUES
('Gabriel García Márquez', 'Colombiana'),
('J.K. Rowling', 'Británica'),
('Isaac Asimov', 'Rusa'),
('Victor Hugo', 'Francesa'),
('Umberto Eco', 'Italiana');

-- Insertar datos en la tabla LIBRO
INSERT INTO LIBRO (Título, Editorial, Area) VALUES
('Cien Años de Soledad', 'Sudamericana', 'Novela'),
('Harry Potter y la Piedra Filosofal', 'Salamandra', 'Fantasía'),
('El Universo: Guía de viaje', 'Editorial Tec', 'Ciencia'),
('Los Miserables', 'Penguin', 'Novela'),
('El Nombre de la Rosa', 'Editorial Tec', 'Novela');

-- Insertar datos en la tabla ESTUDIANTE
INSERT INTO ESTUDIANTE (Nombre, Apellido, Dirección, Carrera, Edad) VALUES
('Juan', 'Perez', 'Calle Falsa 123', 'Informática', 22),
('Maria', 'Gonzalez', 'Av Siempre Viva 742', 'Derecho', 24),
('Carlos', 'Garcia', 'Calle Luna 45', 'Informática', 21),
('Filippo', 'Galli', 'Calle Sol 67', 'Medicina', 23),
('Lucia', 'Gomez', 'Calle Estrella 89', 'Informática', 25);

-- Insertar datos en la tabla LIBROAUTOR
INSERT INTO LIBROAUTOR (idAutor, idLibro) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5);

-- Insertar datos en la tabla PRESTAMO
INSERT INTO PRESTAMO (idLector, idLibro, FechaPrestamo, FechaDevolucion, Devuelto) VALUES
(1, 1, '2021-06-10', '2021-07-10', TRUE),
(2, 2, '2021-06-15', '2021-07-15', TRUE),
(3, 3, '2021-06-16', '2021-07-16', FALSE),
(4, 4, '2021-06-20', '2021-07-20', TRUE),
(5, 5, '2021-06-25', '2021-07-25', FALSE);


-- Queries para resolver las actividades
-- Listar los datos de los autores
SELECT * FROM AUTOR;

-- Listar nombre y edad de los estudiantes
SELECT Nombre, Edad FROM ESTUDIANTE;

-- ¿Qué estudiantes pertenecen a la carrera informática?
SELECT Nombre, Apellido FROM ESTUDIANTE WHERE Carrera = 'Informática';

-- ¿Qué autores son de nacionalidad francesa o italiana?
SELECT Nombre FROM AUTOR WHERE Nacionalidad IN ('Francesa', 'Italiana');

-- ¿Qué libros no son del área de internet?
SELECT Título FROM LIBRO WHERE Area != 'Internet';

-- Listar los libros de la editorial Salamandra
SELECT Título FROM LIBRO WHERE Editorial = 'Salamandra';

-- Listar los datos de los estudiantes cuya edad es mayor al promedio
SELECT * FROM ESTUDIANTE WHERE Edad > (SELECT AVG(Edad) FROM ESTUDIANTE);

-- Listar los nombres de los estudiantes cuyo apellido comience con la letra G
SELECT Nombre FROM ESTUDIANTE WHERE Apellido LIKE 'G%';

-- Listar los autores del libro “El Universo: Guía de viaje”
SELECT A.Nombre
FROM AUTOR A
JOIN LIBROAUTOR LA ON A.idAutor = LA.idAutor
JOIN LIBRO L ON LA.idLibro = L.idLibro
WHERE L.Título = 'El Universo: Guía de viaje';

-- ¿Qué libros se prestaron al lector “Filippo Galli”?
SELECT L.Título
FROM PRESTAMO P
JOIN ESTUDIANTE E ON P.idLector = E.idLector
JOIN LIBRO L ON P.idLibro = L.idLibro
WHERE E.Nombre = 'Filippo' AND E.Apellido = 'Galli';

-- Listar el nombre del estudiante de menor edad
SELECT Nombre FROM ESTUDIANTE ORDER BY Edad ASC LIMIT 1;

-- Listar nombres de los estudiantes a los que se prestaron libros de Base de Datos
SELECT DISTINCT E.Nombre
FROM PRESTAMO P
JOIN ESTUDIANTE E ON P.idLector = E.idLector
JOIN LIBRO L ON P.idLibro = L.idLibro
WHERE L.Título LIKE '%Base de Datos%';

-- Listar los libros que pertenecen a la autora J.K. Rowling
SELECT L.Título
FROM LIBRO L
JOIN LIBROAUTOR LA ON L.idLibro = LA.idLibro
JOIN AUTOR A ON LA.idAutor = A.idAutor
WHERE A.Nombre = 'J.K. Rowling';

-- Listar títulos de los libros que debían devolverse el 16/07/2021
SELECT L.Título
FROM LIBRO L
JOIN PRESTAMO P ON L.idLibro = P.idLibro
WHERE P.FechaDevolucion = '2021-07-16';

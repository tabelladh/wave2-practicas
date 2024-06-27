-- Listar los datos de los autores.
SELECT * FROM autores;

-- Listar nombre y edad de los estudiantes.
SELECT nombre, edad FROM estudiantes;

-- ¿Qué estudiantes pertenecen a la carrera informática?
SELECT nombre, carrera FROM estudiantes WHERE carrera = 'Informática';

-- ¿Qué autores son de nacionalidad francesa o italiana?
SELECT nombre, nacionalidad FROM autores WHERE nacionalidad = 'italiana' OR nacionalidad = 'francesa';

-- ¿Qué libros no son del área de internet?
SELECT titulo, area FROM libros WHERE area != 'Internet';

-- Listar los libros de la editorial Salamandra.
SELECT titulo, editorial FROM libros WHERE editorial = 'Salamandra';


-- Listar los datos de los estudiantes cuya edad es mayor al promedio.
SELECT nombre, edad FROM estudiantes WHERE edad > (SELECT AVG(edad) FROM estudiantes);

-- Listar los nombres de los estudiantes cuyo apellido comience con la letra G.
SELECT nombre, apellido FROM estudiantes WHERE apellido LIKE 'g%';

-- Listar los autores del libro “El Universo: Guía de viaje”. (Se debe listar solamente los nombres).
SELECT nombre, libros.titulo FROM autores
JOIN libros_autores on autores.id_autores = libros_autores.id_autores
JOIN libros on libros.id_libros = libros_autores.id_libros
WHERE libros.titulo LIKE "El Universo: Guía de viaje";

-- ¿Qué libros se prestaron al lector “Filippo Galli”?
SELECT libros.titulo, estudiantes.nombre, estudiantes.apellido FROM estudiantes
JOIN prestamos ON estudiantes.id_lector = prestamos.id_lector
JOIN libros ON prestamos.id_libros = libros.id_libros
WHERE estudiantes.apellido = 'Galli' AND estudiantes.nombre = 'Filippo';

-- Listar el nombre del estudiante de menor edad.
SELECT nombre FROM estudiantes WHERE edad = (SELECT min(edad) FROM estudiantes);

-- Listar nombres de los estudiantes a los que se prestaron libros de Base de Datos.
SELECT estudiantes.nombre, estudiantes.apellido, libros.titulo FROM estudiantes
JOIN prestamos ON estudiantes.id_lector = prestamos.id_lector
JOIN libros ON prestamos.id_libros = libros.id_libros
WHERE libros.area = 'base de datos';

-- Listar los libros que pertenecen a la autora J.K. Rowling.
SELECT nombre, libros.titulo FROM autores
JOIN libros_autores on autores.id_autores = libros_autores.id_autores
JOIN libros on libros.id_libros = libros_autores.id_libros
WHERE autores.nombre LIKE 'J.K. Rowling';


-- Listar títulos de los libros que debían devolverse el 25/07/2024.
SELECT titulo FROM libros
JOIN prestamos on libros.id_libros = prestamos.id_libros
WHERE prestamos.fecha_devolucion = '2024-07-25' AND prestamos.devuelto = 0;

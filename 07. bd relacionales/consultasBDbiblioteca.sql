-- Listar los datos de los autores.
SELECT * FROM autor;

-- Listar nombre y edad de los estudiantes.
SELECT nombre, edad FROM estudiante;

-- ¿Qué estudiantes pertenecen a la carrera informática?
SELECT Nombre, Carrera FROM estudiante 
WHERE carrera LIKE "Informática";

-- ¿Qué autores son de nacionalidad francesa o italiana?
SELECT nombre, Nacionalidad FROM autor
WHERE nacionalidad LIKE "Francesa" OR "Italiana";

SELECT * FROM ESTUDIANTE WHERE Edad > (SELECT AVG(Edad) FROM ESTUDIANTE);
-- ¿Qué libros no son del área de internet?
SELECT Título, Area FROM libro
WHERE area NOT LIKE "internet";

-- Listar los libros de la editorial Salamandra.
SELECT * FROM libro 
WHERE Editorial LIKE "Salamandra";

-- Listar los datos de los estudiantes cuya edad es mayor al promedio.
SELECT * FROM ESTUDIANTE WHERE Edad > (SELECT AVG(Edad) FROM ESTUDIANTE);

-- Listar los nombres de los estudiantes cuyo apellido comience con la letra G.
SELECT nombre, apellido FROM estudiante
WHERE apellido LIKE "G%";

-- Listar los autores del libro “El Universo: Guía de viaje”. (Se debe listar solamente los nombres).
SELECT nombre FROM autor 
JOIN libroautor ON autor.idAutor = libroautor.idAutor
JOIN libro ON libroautor.idLibro = libro.idLibro
where libro.Título = "El Universo: Guía de viaje";

-- ¿Qué libros se prestaron al lector “Filippo Galli”?
SELECT libro.Título FROM libro
JOIN prestamo ON libro.idLibro = prestamo.idLibro
JOIN estudiante ON prestamo.idLector = estudiante.idLector
where estudiante.Nombre = "Filippo" AND estudiante.Apellido = "Galli";

-- Listar el nombre del estudiante de menor edad.
SELECT estudiante.Nombre, edad FROM estudiante  ORDER BY Edad asc limit 1;

-- Listar nombres de los estudiantes a los que se prestaron libros de Base de Datos.

-- Listar los libros que pertenecen a la autora J.K. Rowling.
SELECT libro.Título
FROM libro
JOIN libroautor ON libro.idLibro = libroautor.idLibro
JOIN autor ON libroautor.idAutor = autor.idAutor
WHERE autor.nombre = 'J.K. Rowling';


-- Listar títulos de los libros que debían devolverse el 16/07/2021.
SELECT libro.Título
FROM libro
JOIN prestamo ON libro.idLibro = prestamo.idLibro
WHERE prestamo.FechaDevolucion = '2021-07-16';



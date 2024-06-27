
/*Agregar una película a la tabla movies.*/
INSERT INTO movies(created_at, updated_at,title, rating, awards, release_date, length,
  genre_id) VALUES (NULL,NULL,'Intensamente 2', 7.9, 3, '2024-06-04 00:00:00', 120, 10);
  
SELECT * FROM movies;

/*Agregar un género a la tabla genres.*/
INSERT INTO genres(created_at, updated_at, name, ranking, active) VALUES ('2024-06-19 00:00:00',NULL, "Romántica", 13, 1);


/*Asociar a la película del punto 1. con el género creado en el punto 2.*/
UPDATE movies SET genre_id = 13
WHERE id = 22;

/*Modificar la tabla actors para que al menos un actor tenga como favorita la película agregada 
en el punto 1.*/
UPDATE actors SET favorite_movie_id = 22
WHERE id = 49;

-- SELECT * FROM actors;

/*Crear una tabla temporal copia de la tabla movies.*/
-- *Eliminar de esa tabla temporal todas las películas que hayan ganado menos de 5 awards.*/

CREATE TEMPORARY TABLE movie_copy AS SELECT * FROM movies
WHERE awards >=5;

SELECT * 
FROM movie_copy;

-- DROP table movie_copy;
/
/*Obtener la lista de todos los géneros que tengan al menos una película.*/
SELECT DISTINCT g.id, g.name FROM genres g
JOIN movies m ON g.id = m.genre_id;

/*Obtener la lista de actores cuya película favorita haya ganado más de 3 awards.*/
SELECT a.id, a.first_name, a.last_name  
FROM actors a
JOIN movies m ON a.favorite_movie_id = m.id
WHERE m.awards > 3;

/*Crear un índice sobre el nombre en la tabla movies.*/

CREATE INDEX idx_nombre_pelicula ON movies(title);
/*Chequee que el índice fue creado correctamente.*/
SHOW INDEX FROM movies;

/*En la base de datos movies ¿Existiría una mejora notable al crear índices? 
Analizar y justificar la respuesta.*/
-- Optimiza  el tiempo de busqueda y ordenamiento- mejora rendimiento de la consulta

/*¿En qué otra tabla crearía un índice y por qué? Justificar la respuesta.*/
-- Debatiendo con el equipo se podrían implementar índices en las tablas
-- series, en este caso colocar un índice en title, y en la tabla actors, en este caso
-- un índice en el last_name.

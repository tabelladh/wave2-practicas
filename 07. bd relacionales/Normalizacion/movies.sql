-- 1. Agregar una película a la tabla movies
INSERT INTO movies (created_at, updated_at, title, rating, awards, release_date, length, genre_id)
VALUES (NOW(), NOW(), 'New Movie', 8.5, 0, '2024-06-19', 120, NULL);
SELECT * FROM movies;

-- 2. Agregar un género a la tabla genres
INSERT INTO genres (created_at, updated_at, name, ranking, active)
VALUES (NOW(), NOW(), 'New Genre', 13, 1);
SELECT * FROM genres;

-- 3. Asociar a la película del punto 1 con el género creado en el punto 2
SET SQL_SAFE_UPDATES = 0;
UPDATE movies
SET genre_id = (SELECT id FROM genres WHERE name = 'New Genre')
WHERE title = 'New Movie';
SET SQL_SAFE_UPDATES = 1;

-- 4. Modificar la tabla actors para que al menos un actor tenga como favorita la película agregada en el punto 1
UPDATE actors
SET favorite_movie_id = (SELECT id FROM movies WHERE title = 'New Movie')
WHERE id = 1; -- Asumiendo que el actor con id=1 es el que estamos actualizando
SELECT * FROM actors;

-- 5. Crear una tabla temporal copia de la tabla movies
CREATE TEMPORARY TABLE movies_temp AS SELECT * FROM movies;
SELECT * FROM movies_temp;

-- 6. Eliminar de esa tabla temporal todas las películas que hayan ganado menos de 5 awards
DELETE FROM movies_temp WHERE awards < 5;
SELECT * FROM movies_temp;

-- 7. Obtener la lista de todos los géneros que tengan al menos una película
SELECT DISTINCT g.name
FROM genres g
JOIN movies m ON g.id = m.genre_id;

-- 8. Obtener la lista de actores cuya película favorita haya ganado más de 3 awards
SELECT a.first_name, a.last_name
FROM actors a
JOIN movies m ON a.favorite_movie_id = m.id
WHERE m.awards > 3;

-- 9. Crear un índice sobre el nombre en la tabla movies
CREATE INDEX idx_movies_title ON movies(title);

-- 10. Chequear que el índice fue creado correctamente
SHOW INDEX FROM movies WHERE Key_name = 'idx_movies_title';

-- 11. Justificación para la creación de índices
-- Los índices mejoran significativamente la velocidad de consulta, especialmente en columnas 
-- que se utilizan frecuentemente en WHERE, JOIN, y ORDER BY cláusulas. En el caso de la tabla movies,
-- el índice en el título puede acelerar las búsquedas de películas por nombre, mejorando el rendimiento
-- para aplicaciones que consultan títulos frecuentemente.

-- 12. Creación de otro índice justificado
-- Crear un índice en la tabla actors sobre la columna last_name o first_name si se realizan búsquedas frecuentes
-- por nombre de actor. Esto optimizaría las consultas que filtran o buscan actores por su nombre, mejorando el
-- tiempo de respuesta de dichas consultas.
CREATE INDEX idx_actors_last_name ON actors(last_name);

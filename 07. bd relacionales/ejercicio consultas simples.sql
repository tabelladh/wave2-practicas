-- 3 --
-- Mostrar el título de todas las series y usar alias para que tanto el nombre de la tabla --
-- como el campo estén en español. --
select title from series; 

SELECT title AS titulo FROM series AS series_español;
-- 4 --
-- Mostrar el nombre y apellido de los actores cuyo rating sea mayor a 7.5. --
SELECT first_name AS nombre, last_name AS apellido, 
rating AS puntuacion FROM actors WHERE rating > 7.5;
-- 5 --
-- Mostrar el título de las películas, el rating y los premios de las películas con un --
-- rating mayor a 7.5 y con más de dos premios. --

SELECT title AS titulo, rating, awards AS premios
FROM movies
WHERE rating > 7.5 AND awards > 2;
-- 6 --
-- Mostrar el título de las películas y el rating ordenadas por rating en forma ascendente. --
SELECT title, rating
FROM movies
ORDER BY rating ASC;
-- 7 --
-- Mostrar los títulos de las primeras tres películas en la base de datos. --
SELECT title
FROM movies LIMIT 3;
-- 8 --
-- Mostrar el top 5 de las películas con mayor rating --
SELECT title, rating
FROM movies 
ORDER BY rating DESC LIMIT 5;

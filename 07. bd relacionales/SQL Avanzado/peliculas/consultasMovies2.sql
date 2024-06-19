USE movies_db;

-- Ejercicio clase
SELECT m.title, a.first_name, a.last_name
FROM movies m
JOIN actor_movie ac ON m.id = ac.movie_id
JOIN actors a ON ac.actor_id = a.id;

-- Mostrar el título y el nombre del género de todas las series
SELECT s.title AS serie_titulo, g.name AS genero_nombre
FROM series s
JOIN genres g ON s.genre_id = g.id;

-- Mostrar el título de los episodios, el nombre y apellido de los actores que trabajan en cada uno de ellos
SELECT e.title AS episodio_titulo, a.first_name AS actor_nombre, a.last_name AS actor_apellido
FROM episodes e
JOIN actor_episode ae ON e.id = ae.episode_id
JOIN actors a ON ae.actor_id = a.id;

-- Mostrar el título de todas las series y el total de temporadas que tiene cada una de ellas
SELECT s.title AS serie_titulo, COUNT(se.id) AS total_temporadas
FROM series s
JOIN seasons se ON s.id = se.serie_id
GROUP BY s.title;

-- Mostrar el nombre de todos los géneros y la cantidad total de películas por cada uno, siempre que sea mayor o igual a 3
SELECT g.name AS genero_nombre, COUNT(m.id) AS total_peliculas
FROM genres g
JOIN movies m ON g.id = m.genre_id
GROUP BY g.name
HAVING COUNT(m.id) >= 3;

-- Mostrar sólo el nombre y apellido de los actores que trabajan en todas las películas de la guerra de las galaxias y que estos no se repitan
SELECT DISTINCT a.first_name AS actor_nombre, 
a.last_name AS actor_apellido
FROM actors a
JOIN actor_movie am ON a.id = am.actor_id
JOIN movies m ON am.movie_id = m.id
WHERE m.title LIKE '%Guerra de las Galaxias%';

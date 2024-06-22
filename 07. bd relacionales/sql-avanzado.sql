-- Mostrar el título y el nombre del género de todas las series.
SELECT series.title , genres.name
 FROM series
 JOIN genres ON series.genre_id = genres.id


-- Mostrar el título de los episodios, el nombre y apellido de los actores que trabajan en cada uno de ellos.
SELECT episodes.title , a.first_name, a.last_name
FROM episodes 
JOIN actor_episode ae ON episodes.id = ae.episode_id
JOIN actors a ON ae.actor_id = a.id;

-- Mostrar el título de todas las series y el total de temporadas que tiene cada una de ellas.
SELECT s.title , COUNT(se.number) AS total
FROM series s
JOIN seasons se ON s.id = se.serie_id
GROUP BY s.title;

-- Mostrar el nombre de todos los géneros y la cantidad total de películas por cada uno, siempre que sea mayor o igual a 3.

SELECT genres.name ,COUNT(movies.id)
FROM genres
JOIN movies ON genres.id = movies.genre_id
GROUP BY genres.name
HAVING COUNT(movies.id) >= 3;




-- Mostrar sólo el nombre y apellido de los actores que trabajan en todas las películas de la guerra de las galaxias y que estos no se repitan.

SELECT a.first_name, a.last_name
FROM actors a
JOIN actor_movie am ON a.id = am.actor_id
JOIN movies m ON am.movie_id = m.id
WHERE m.title LIKE '%La Guerra de las Galaxias%'
GROUP BY a.id, a.first_name, a.last_name
HAVING COUNT(DISTINCT m.id) = (
    SELECT COUNT(*)
    FROM movies
    WHERE title LIKE '%La Guerra de las Galaxias%'
);
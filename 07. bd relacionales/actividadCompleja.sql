-- Listar todos los actores que tengan declarada una película favorita.
select a.first_name, a.last_name, m.title from actors a
JOIN movies m ON a.favorite_movie_id = m.id 
where favorite_movie_id is not null;

-- Listar todos los actores que tengan rating superior a <valor recibido por parámetro>
SELECT * FROM Actors a WHERE a.rating > ':rating';

-- Listar todos los actores que trabajan en la <película recibida por parámetro>
select *
from actors a
join actor_movie am on a.id = am.actor_id
join movies m on am.movie_id = m.id
where m.title like '%:nombrePelicula%';

-- Listar todas las películas cuyos actores tengan rating superior a <valor recibido por parámetro>

SELECT DISTINCT m.title
FROM movies m
JOIN actor_movie am ON m.id = am.movie_id
JOIN actors a ON am.actor_id = a.id
WHERE a.rating > ':rating';

-- Listar todas las películas que pertenezcan al <género recibido por parámetro>
SELECT m.title, g.name AS genre
FROM movies m
JOIN genres g ON m.genre_id = g.id
WHERE g.name LIKE '%comedia%';

-- Listar todas las series que tengan más de <cantidad de temporadas recibida por parámetro>
SELECT s.title AS serie_title, COUNT(ss.id) AS num_seasons
FROM series s
JOIN seasons ss ON s.id = ss.serie_id 
GROUP BY s.id, s.title
HAVING COUNT(ss.id) > 5;

-- Listar todos los episodios (de cualquier serie) donde trabaja un actor 
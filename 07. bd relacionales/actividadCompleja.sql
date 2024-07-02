-- Listar todos los actores que tengan declarada una película favorita.
select * from actors where favorite_movie_id IS NOT NULL;

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
WHERE a.rating > 5;

-- Listar todas las películas que pertenezcan al <género recibido por parámetro>
SELECT m.title, g.name AS genre
FROM movies m
JOIN genres g ON m.genre_id = g.id
WHERE g.name LIKE '%comedia%';
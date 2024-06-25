-- Agregar una película a la tabla movies.
INSERT INTO movies (title, rating, awards, release_date, length) VALUES ('Nueva Peli', 9.5, 2, "2008-03-04 00:00:00", 160 );
SELECT * FROM movies;

-- Agregar un género a la tabla genres.
INSERT INTO genres (name, ranking) VALUES ('nuevo género', 23);
SELECT * FROM genres;

-- Asociar a la película del punto 1. con el género creado en el punto 2.
UPDATE movies SET genre_id = 14 WHERE id = 24;
SELECT * FROM movies;

-- Modificar la tabla actors para que al menos un actor tenga como favorita la película agregada en el punto 1.
UPDATE actors SET favorite_movie_id = 24 WHERE id = 14;
SELECT * FROM actors where favorite_movie_id = 24;

-- Crear una tabla temporal copia de la tabla movies.
CREATE TEMPORARY TABLE temp_moviess (
  titulo VARCHAR(50),
  rating INT,
  awards INT,
  relese_date datetime
);

INSERT INTO temp_movies ( title, rating, awards, relese_date)
SELECT
  series.title AS title,
  seasons.title AS temporada,
  episodes.number AS episodio,
  episodes.title AS titulo_episodio;


-- Eliminar de esa tabla temporal todas las películas que hayan ganado menos de 5 awards.
DELETE FROM temp_movies WHERE awards < 5;
SELECT * FROM temp_movies;

-- Obtener la lista de todos los géneros que tengan al menos una película.
SELECT DISTINCT genres.name
FROM genres
JOIN movies ON genres.id = movies.genre_id;

-- Obtener la lista de actores cuya película favorita haya ganado más de 3 awards.
SELECT actors.first_name, actors.last_name
FROM actors
JOIN movies ON actors.favorite_movie_id = movies.id
WHERE movies.awards > 3;

-- Crear un índice sobre el nombre en la tabla movies.
CREATE INDEX idx_movies_title ON movies (title);

-- Chequee que el índice fue creado correctamente.
SHOW INDEX FROM movies;



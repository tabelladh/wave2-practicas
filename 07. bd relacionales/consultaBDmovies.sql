USE movies_db;
-- 1) Mostrar el título y el nombre del género de todas las series.
SELECT genres.name,  series.title
FROM series
JOIN genres on  series.genre_id = genres.id;

-- 2) Mostrar el título de los episodios, el nombre y apellido de los actores que trabajan en cada uno de ellos.
SELECT episodes.title, actors.first_name, actors.last_name
FROM episodes
JOIN actor_episode on  episodes.id= actor_episode.episode_id
JOIN actors on actor_episode.actor_id = actors.id;

-- 3) Mostrar el título de todas las series y el total de temporadas que tiene cada una de ellas.
SELECT series.title, COUNT(seasons.id) AS totalSeason
FROM series
JOIN seasons ON series.id = seasons.serie_id
GROUP BY series.title;


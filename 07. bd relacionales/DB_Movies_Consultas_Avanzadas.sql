-- Mostrar el título y el nombre del género de todas las series.
select s.title, g.name
from series s
join genres g on s.genre_id = g.id;

-- Mostrar el título de los episodios, el nombre y apellido de los actores que trabajan en cada uno de ellos.
select e.title, a.first_name, a.last_name 
from episodes e
join actor_episode ae on e.id = ae.episode_id
join actors a on ae.actor_id = a.id;

-- Mostrar el título de todas las series y el total de temporadas que tiene cada una de ellas.
select s.title, count(ss.number) as total_temporadas
from series s
join seasons ss on s.id = ss.serie_id
group by s.title;

-- Mostrar el nombre de todos los géneros y la cantidad total de películas por cada uno, siempre que sea mayor o igual a 3.
select g.name, count(m.id) as total_pelicula_por_genero
from genres g
join movies m on g.id = m.genre_id
group by g.name
having count(m.id) > 3;

-- Mostrar sólo el nombre y apellido de los actores que trabajan en todas las películas de la guerra de las galaxias y que estos no se repitan.
select distinct a.first_name, a.last_name 
from actors a
join actor_movie am on a.id = am.actor_id
join movies m on am.movie_id = m.id
where m.title like "%guerra de las galaxias%";

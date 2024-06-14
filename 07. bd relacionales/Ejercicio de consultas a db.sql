SELECT * FROM movies;
SELECT * FROM actors;
select first_name, last_name, rating from actors;

select title as Titulo from series;

SELECT first_name, last_name FROM actors WHERE rating> 7.5;

SELECT title, rating, awards FROM movies WHERE rating> 7.5 and awards > 2;

SELECT title, rating
FROM movies
ORDER BY rating;

select * from movies limit 3;

SELECT title, rating
FROM movies
ORDER BY rating DESC
LIMIT 5;

select * from actors limit 10;

SELECT title, rating
FROM movies
WHERE title LIKE "%Toy Story%";

SELECT *
FROM actors
WHERE first_name LIKE "Sam%";

SELECT title, release_date
FROM movies
WHERE release_date
BETWEEN "2004-01-01" AND "2008-12-31";

SELECT title AS titulo, release_date AS Fecha_lanzamiento, awards AS Premios, rating AS Rating
FROM movies
WHERE rating > 3 
AND awards > 1 
AND release_date BETWEEN "1988-01-01" AND "2009-12-31"
ORDER BY rating;













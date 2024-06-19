SELECT * FROM actors;

SELECT id, first_name, last_name, rating FROM actors
WHERE rating >= 8 AND rating < 10 ORDER BY rating ;

INSERT INTO actors VALUES(50, null, null, 'Diego','Peretti', 10, null);
UPDATE actors SET rating = 9 WHERE id = 50;
DELETE FROM actors WHERE id = 50;
SELECT id, first_name, last_name, MAX(rating) AS Mayor_Rating FROM actors;
SELECT AVG(rating) AS Promedio FROM actors;
SELECT COUNT(rating) AS Cantidad FROM actors;

SELECT title AS Título FROM series AS Series;

SELECT first_name, last_name FROM actors WHERE rating > 7.5;

SELECT title, rating, awards FROM movies WHERE rating > 7.5 AND awards > 2;

SELECT title, rating FROM movies ORDER BY rating ASC;

SELECT title FROM movies LIMIT 3;

SELECT title, rating FROM movies ORDER BY rating DESC LIMIT 5;

SELECT first_name, last_name FROM actors LIMIT 10;

SELECT title, rating FROM movies WHERE title = 'Toy Story';

SELECT first_name, last_name FROM actors WHERE first_name LIKE 'Sam%';

SELECT title, YEAR(release_date) AS Year FROM movies WHERE YEAR(release_date) BETWEEN 2004 AND 2008;

SELECT title, rating FROM movies WHERE rating > 3 AND awards > 1 AND release_date BETWEEN '1988-01-01' AND '2009-12-31' ORDER BY rating DESC;


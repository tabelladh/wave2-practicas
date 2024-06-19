CREATE TEMPORARY TABLE TWD (
    id INT,
    title VARCHAR(500),
    number INT,
    release_date DATETIME,
    rating DECIMAL(3,1),
    season_id INT
);

-- Obtener el serie_id de "The Walking Dead"
SELECT id INTO @serie_id
FROM series
WHERE title = 'The Walking Dead';

-- Insertar los episodios de todas las temporadas de "The Walking Dead" en la tabla temporal
INSERT INTO TWD (id, title, number, release_date, rating, season_id)
SELECT e.id, e.title, e.number, e.release_date, e.rating, e.season_id
FROM episodes e
JOIN seasons s ON e.season_id = s.id
WHERE s.serie_id = @serie_id;

-- Obtener la season_id de la primera temporada de "The Walking Dead"
SELECT id INTO @first_season_id
FROM seasons
WHERE serie_id = @serie_id AND number = 1;

-- Consultar los episodios de la primera temporada
SELECT *
FROM TWD
WHERE season_id = @first_season_id;

-- Crear el índice compuesto en la tabla episodes
CREATE INDEX idx_season_release_date ON episodes (season_id, release_date);

-- Chequear la creación del índice
SHOW INDEX FROM episodes;


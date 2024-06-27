CREATE TEMPORARY TABLE TWD (
    titulo VARCHAR(100),
    temporada VARCHAR(50),
    episodio INT,
    titulo_episodio VARCHAR(100)
);

INSERT INTO TWD (titulo, temporada, episodio, titulo_episodio)
SELECT 	series.title as titulo,
		seasons.title AS temporada,
		episodes.number AS episodio,
		episodes.title AS titulo_episodio
FROM series
JOIN seasons ON series.id = seasons.serie_id
JOIN episodes ON episodes.season_id = seasons.id
WHERE series.title = 'The Walking Dead';

SELECT * FROM TWD;

 

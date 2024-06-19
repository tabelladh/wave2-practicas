-- Con la base de datos “movies”, se propone crear una tabla temporal llamada “TWD” y guardar en la misma los episodios de todas las temporadas de “The Walking Dead”.
CREATE TEMPORARY TABLE TWD (
	id int not null primary key auto_increment,
    nombre_episodio VARCHAR(50),
    nombre_temporada VARCHAR(50)
);

DROP TEMPORARY TABLE TWD;

INSERT INTO TWD (nombre_episodio, nombre_temporada)
SELECT sea.title as nombre_temporada, e.title as nombre_episodio
FROM series s
join seasons sea on s.id = sea.serie_id
join episodes e on sea.id = e.season_id
WHERE s.title = "The Walking Dead" AND sea.title = "Primer temporada";

SELECT * FROM TWD;


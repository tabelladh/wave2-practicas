INSERT INTO alumnos (nombre, apellidos, fecha_nacimiento, dni, direccion) VALUES
('Juan', 'Pérez', '1990-01-01', 12345678, 'Calle Falsa 123'),
('María', 'García', '1985-05-15', 23456789, 'Calle Verdadera 456'),
('Carlos', 'López', '2000-12-25', 34567890, 'Calle Real 789');


INSERT INTO aulas (nombre) VALUES
('A'),
('B');

INSERT INTO cursos (nombre, grado, certificado, duracion, aulas_id) VALUES
('Matemáticas','Técnica', false, 180.0,1),
('Historia', 'Bachiller', false, 150.0,1),
('Inglés', 'Bachiller', true, 200.0,2),
('Programación', 'Técnica', true, 450.0,2);

INSERT INTO usuarios (user, password, alumnos_id) VALUES
('juan','123456', 1),
('maria','456789', 2);

INSERT INTO alumnos_cursos (alumnos_id, cursos_id) VALUES
(1,1);

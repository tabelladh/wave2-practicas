
-- Crear base de datos para poder insertar tablas
CREATE DATABASE COMERCIO;
USE COMERCIO;

CREATE TABLE DEPARTAMENTO (
    depto_nro VARCHAR(7) PRIMARY KEY,
    nombre_depto VARCHAR(50),
    localidad VARCHAR(50)
);

INSERT INTO DEPARTAMENTO (depto_nro, nombre_depto, localidad) VALUES
('D-000-1', 'Software', 'Los Tigres'),
('D-000-2', 'Sistemas', 'Guadalupe'),
('D-000-3', 'Contabilidad', 'La Roca'),
('D-000-4', 'Ventas', 'Plata');


CREATE TABLE EMPLEADO (
    cod_emp VARCHAR(6) PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    puesto VARCHAR(50),
    fecha_alta DATE,
    salario DECIMAL(10, 2),
    comision DECIMAL(10, 2),
    depto_nro VARCHAR(7),
    FOREIGN KEY (depto_nro) REFERENCES DEPARTAMENTO(depto_nro)
);

INSERT INTO EMPLEADO (cod_emp, nombre, apellido, puesto, fecha_alta, salario, comision, depto_nro) VALUES
('E-0001', 'César', 'Piñero', 'Vendedor', '2018-05-12', 80000, 15000, 'D-000-4'),
('E-0002', 'Yosep', 'Kowaleski', 'Analista', '2015-07-14', 140000, 0, 'D-000-2'),
('E-0003', 'Mariela', 'Barrios', 'Director', '2014-06-05', 185000, 0, 'D-000-3'),
('E-0004', 'Jonathan', 'Aguilera', 'Vendedor', '2015-06-03', 85000, 10000, 'D-000-4'),
('E-0005', 'Daniel', 'Brezezicki', 'Vendedor', '2018-03-03', 83000, 10000, 'D-000-4'),
('E-0006', 'Mito', 'Barchuk', 'Presidente', '2014-06-05', 190000, 0, 'D-000-3'),
('E-0007', 'Emilio', 'Galarza', 'Desarrollador', '2014-08-02', 60000, 0, 'D-000-1');


-- Queries del ejercicio
-- Query 1: Seleccionar el nombre, el puesto y la localidad de los departamentos donde trabajan los vendedores.
SELECT e.nombre, e.puesto, d.localidad
FROM EMPLEADO e
JOIN DEPARTAMENTO d ON e.depto_nro = d.depto_nro
WHERE e.puesto = 'Vendedor';

-- Query 2: Visualizar los departamentos con más de cinco empleados.
SELECT d.nombre_depto, COUNT(e.cod_emp) AS num_empleados
FROM DEPARTAMENTO d
JOIN EMPLEADO e ON d.depto_nro = e.depto_nro
GROUP BY d.nombre_depto
HAVING COUNT(e.cod_emp) > 5;

-- Query 3: Mostrar el nombre, salario y nombre del departamento de los empleados que tengan el mismo puesto que ‘Mito Barchuk’.
SELECT e.nombre, e.salario, d.nombre_depto
FROM EMPLEADO e
JOIN DEPARTAMENTO d ON e.depto_nro = d.depto_nro
WHERE e.puesto = (SELECT puesto FROM EMPLEADO WHERE nombre = 'Mito' AND apellido = 'Barchuk');

-- Query 4: Mostrar los datos de los empleados que trabajan en el departamento de contabilidad, ordenados por nombre.
SELECT *
FROM EMPLEADO
WHERE depto_nro = (SELECT depto_nro FROM DEPARTAMENTO WHERE nombre_depto = 'Contabilidad')
ORDER BY nombre;

-- Query 5: Mostrar el nombre del empleado que tiene el salario más bajo.
SELECT nombre
FROM EMPLEADO
ORDER BY salario ASC
LIMIT 1;

-- Query 6: Mostrar los datos del empleado que tiene el salario más alto en el departamento de ‘Ventas’.
SELECT *
FROM EMPLEADO
WHERE depto_nro = (SELECT depto_nro FROM DEPARTAMENTO WHERE nombre_depto = 'Ventas')
ORDER BY salario DESC
LIMIT 1;

CREATE TABLE FACTURA (
  id_factura INT PRIMARY KEY,
  fecha_factura DATE,
  forma_pago DECIMAL(10, 0),
  IVA DECIMAL(10, 0),
  importe DECIMAL(10, 0)
);

CREATE TABLE CLIENTE (
  id_cliente INT PRIMARY KEY AUTO_INCREMENT,
  nombre_cliente VARCHAR(40),
  apellido_cliente VARCHAR(40),
  direccion_cliente VARCHAR(40)
);

CREATE TABLE ARTICULO (
  id_articulo INT PRIMARY KEY AUTO_INCREMENT,
  descripcion_articulo VARCHAR(40)
);

CREATE TABLE FACTURA_ARTICULO (
  id_factura INT,
  id_articulo INT,
  cantidad INT,
  PRIMARY KEY (id_factura, id_articulo),
  FOREIGN KEY (id_factura) REFERENCES FACTURA(id_factura),
  FOREIGN KEY (id_articulo) REFERENCES ARTICULO(id_articulo)
);

CREATE TABLE FACTURA_CLIENTE (
  id_factura INT,
  id_cliente INT,
  PRIMARY KEY (id_factura, id_cliente),
  FOREIGN KEY (id_factura) REFERENCES FACTURA(id_factura),
  FOREIGN KEY (id_cliente) REFERENCES CLIENTE(id_cliente)
);


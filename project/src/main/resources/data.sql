DROP TABLE IF EXISTS mascotas;
DROP TABLE IF EXISTS autores;
DROP TABLE IF EXISTS medicamentos;

CREATE TABLE mascotas(
  id IDENTITY NOT NULL PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL,
  tipo VARCHAR(50) NOT NULL,
  fechaingreso DATE,
  razon VARCHAR(50) NOT NULL
 );
 INSERT INTO mascotas(nombre,tipo,fechaingreso,razon)
    VALUES('puchi','perro','2021-12-12','vacunacion');
  INSERT INTO mascotas(nombre,tipo,fechaingreso,razon)
     VALUES('bigotes','conejo','2021-03-01','chequeo');
  INSERT INTO mascotas(nombre,tipo,fechaingreso,razon)
         VALUES('nala','perro','2021-05-23','moquillo');
  INSERT INTO mascotas(nombre,tipo,fechaingreso,razon)
             VALUES('sombra','gato','2021-02-10','vacunacion');
  INSERT INTO mascotas(nombre,tipo,fechaingreso,razon)
             VALUES('pirata','gato','2021-04-10','chequeo');

CREATE TABLE dueños(
  id IDENTITY NOT NULL PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL,
  telefono VARCHAR(50) NOT NULL
 );
 INSERT INTO dueños(nombre,telefono)
    VALUES ('Richard Bach','9613527858');
  INSERT INTO deuños(nombre,telefono)
    VALUES ('Borges','9651234589');
  INSERT INTO dueños(nombre,telefono)
    VALUES ('Jose Hernandez','9684551234');
  INSERT INTO dueños(nombre,telefono)
    VALUES ('Mario Molina','9662657898');
  INSERT INTO dueños(nombre,telefono)
    VALUES ('Paenza','9613524555');

CREATE TABLE medicamentos(
  id IDENTITY NOT NULL PRIMARY KEY,
  codigo INT
  nombre VARCHAR(40) NOT NULL
 );
  INSERT INTO medicamentos(codigo,nombre) VALUES(845,'vacuna para la rabia');
  INSERT INTO medicamentos(codigo,nombre) VALUES(1023.'vitaminas');
  INSERT INTO medicamentos(codigo,nombre) VALUES(4455,'jabon anti-pulgas');
  INSERT INTO medicamentos(codigo,nombre) VALUES(289345,'talco anti-garrapatas');
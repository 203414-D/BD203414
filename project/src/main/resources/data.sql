DROP TABLE IF EXISTS mascotas;
DROP TABLE IF EXISTS duenos;
DROP TABLE IF EXISTS medicamentos;

CREATE TABLE mascotas(
  idmascota IDENTITY NOT NULL PRIMARY KEY,
  nombremascota VARCHAR(50) NOT NULL,
  tipomascota VARCHAR(50) NOT NULL,
  medicamentomas VARCHAR(50) NOT NULL
 );
 INSERT INTO mascotas(nombremascota,tipomascota,medicamentomas)
    VALUES('puchi','perro','royal canin');
  INSERT INTO mascotas(nombremascota,tipomascota,medicamentomas)
     VALUES('bigotes','conejo','Naxpet');
  INSERT INTO mascotas(nombremascota,tipomascota,medicamentomas)
         VALUES('nala','perro','nipramida');
  INSERT INTO mascotas(nombremascota,tipomascota,medicamentomas)
             VALUES('sombra','gato','nipramida');
  INSERT INTO mascotas(nombremascota,tipomascota,medicamentomas)
             VALUES('pirata','gato','nexgard');

CREATE TABLE duenos(
  id IDENTITY NOT NULL PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL,
  telefono VARCHAR(50) NOT NULL
 );
 INSERT INTO duenos(nombre,telefono)
    VALUES ('Richard Bach','9613527858');
  INSERT INTO duenos(nombre,telefono)
    VALUES ('Borges','9651234589');
  INSERT INTO duenos(nombre,telefono)
    VALUES ('Jose Hernandez','9684551234');
  INSERT INTO duenos(nombre,telefono)
    VALUES ('Mario Molina','9662657898');
  INSERT INTO duenos(nombre,telefono)
    VALUES ('Paenza','9613524555');

CREATE TABLE medicamentos(
  id IDENTITY NOT NULL PRIMARY KEY,
  codigo INT,
  nombre VARCHAR(40) NOT NULL
 );
  INSERT INTO medicamentos(codigo,nombre) VALUES(845,'vacuna para la rabia');
  INSERT INTO medicamentos(codigo,nombre) VALUES(1023,'vitaminas');
  INSERT INTO medicamentos(codigo,nombre) VALUES(4455,'jabon anti-pulgas');
  INSERT INTO medicamentos(codigo,nombre) VALUES(289345,'talco anti-garrapatas');
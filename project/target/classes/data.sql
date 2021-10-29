DROP TABLE IF EXISTS libros;
DROP TABLE IF EXISTS autores;
DROP TABLE IF EXISTS editorieales;

CREATE TABLE libros(
  id IDENTITY NOT NULL PRIMARY KEY,
  titulo VARCHAR(50) NOT NULL,
  idautor INT,
  ideditorial INT ,
  precio DOUBLE
 );
 INSERT INTO libros(titulo,idautor,ideditorial,precio)
    VALUES('El Alquimista',2,2,20);
  INSERT INTO libros(titulo,idautor,ideditorial,precio)
    VALUES('Martin Fierro',3,1,30);
  INSERT INTO libros(titulo,idautor,ideditorial,precio)
    VALUES('Aprenda Matematicas',4,3,50);
  INSERT INTO libros(titulo,idautor,ideditorial,precio)
    VALUES('Uno',1,1,15);
  INSERT INTO libros(titulo,idautor,ideditorial,precio)
    VALUES('Java en 10 minutos',2,3,45);
  INSERT INTO libros(titulo,idautor,ideditorial,precio)
    VALUES('Historia Moderna de Mexico',1,4,15);
  INSERT INTO libros(titulo,idautor,ideditorial,precio)
    VALUES('Historias de terror',5,4,50);

CREATE TABLE autores(
  id IDENTITY NOT NULL PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL
 );
 INSERT INTO autores(nombre) VALUES ('Richard Bach');
  INSERT INTO autores(nombre) VALUES ('Borges');
  INSERT INTO autores(nombre) VALUES ('Jose Hernandez');
  INSERT INTO autores(nombre) VALUES ('Mario Molina');
  INSERT INTO autores(nombre) VALUES ('Paenza');

CREATE TABLE editoriales(
  id IDENTITY NOT NULL PRIMARY KEY,
  nombre VARCHAR(40)
 );
 INSERT INTO editoriales(nombre) VALUES('Planeta');
  INSERT INTO editoriales(nombre) VALUES('Emece');
  INSERT INTO editoriales(nombre) VALUES('Siglo XXI');
  INSERT INTO editoriales(nombre) VALUES('Plaza');
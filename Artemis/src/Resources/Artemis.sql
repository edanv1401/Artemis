
#crear base de datos
create database Artemis;

#usar la base de datos, es necesario ejecutar
use Artemis;

#crear tabla que contiene los datos de inicio de sesion
create table cuentaUsuario (
id int primary key auto_increment not null,
username varchar(100) unique key,
passwordkey varchar(100),
persona integer
);

#Crear tabla que contiene los datos de una persona
create table if not exists personas(
documento integer primary key auto_increment not null,
nombre varchar(30) not null
);

#relacionamos una cuenta con una persona
ALTER TABLE cuentaUsuario
ADD CONSTRAINT FK_CuentaPersona
FOREIGN KEY (persona) REFERENCES personas(documento);

#tabla auditoria almacena un registro cuando algun usuario de la bd agrega un dato a cualquier tabla
create table auditoriaArtemis (
id int primary key auto_increment not null,
fecha date,
hora time,
usuario varchar(100),
nombreTabla varchar (50)
);

#Cada vez que alguien meta un valor en cuentaUsuario se genera automaticamente un campo de auditoria
DELIMITER $$
CREATE TRIGGER auditoria_creacion_cuentaUsuario
 AFTER INSERT ON cuentaUsuario
 FOR EACH ROW
BEGIN
insert INTO auditoriaArtemis values (null,now(),now(),current_user(),'cuentaUsuario');
END;
$$
DELIMITER ;

#Cada vez que alguien meta un valor en persona se genera automaticamente un campo de auditoria
DELIMITER $$
CREATE TRIGGER auditoria_creacion_persona
 AFTER INSERT ON personas
 FOR EACH ROW
BEGIN
insert INTO auditoriaArtemis values (null,now(),now(),current_user(),'persona');
END;
$$
DELIMITER ;

#la foreign key obliga a que se debe tener la persona antes de crear la cuenta para asociarsela
insert into personas values(null,'Miller');
insert into cuentaUsuario values(null,'jajaxd','prueba',1);

#Mostrar el contenido de cada tabla inicial
select * from personas;
select * from auditoriaArtemis ;
select * from cuentaUsuario;

#juntamos toda la informacion de la cuenta en una vista, solo para ver la informacion, no modificarla
create view informacioncuenta as
SELECT cuentaUsuario.*,personas.nombre
FROM cuentaUsuario
INNER JOIN personas
ON personas.documento=cuentaUsuario.persona;

#imprimimos la vista que se actualiza sola
SELECT * FROM informacioncuenta;

#tabla de inicio de sesion
create table inicioSesion(
id int primary key auto_increment not null,
usuario varchar(100),
fecha date,
hora time
);




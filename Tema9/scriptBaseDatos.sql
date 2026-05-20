drop database if exists inversiones;
create database inversiones;
use inversiones;
create table empresas (id integer primary key auto_increment, nombre varchar(50), fundacion varchar(4));
create table acciones(id integer primary key auto_increment, propietario varchar(50), id_empresa integer, cantidad integer, FOREIGN KEY(id_empresa) references empresas(id) on delete cascade);
drop user if exists java;
create user java identified by 'Ageofempires2';
grant all on inversiones.* to java;
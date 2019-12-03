-- -------------------------------------------------------------------------------
-- CREACION DE LAS TABLAS SEMESTRE, CARRERA, PRACTICA, ALUMNO, USUARIO, REGISTRO
-- -------------------------------------------------------------------------------
create table semestre(
    codigo text not null ,
    nombre text not null,
    constraint pk_semestre primary key(codigo)
);

create table carrera(
    codigo text not null,
    nombre text not null,
    constraint pk_carrera primary key(codigo)
);  

create table practica(
    codigo text not null,
    nombre text not null,
    codigosemestre text not null,
    codigocarrera text not null,
    fechacreacion timestamp(0) not null,
    fechaactualizacion timestamp(0),
    fechaeliminacion timestamp(0),
    constraint fk_psemestre foreign key(codigosemestre) references semestre(codigo) on delete cascade on update cascade,
    constraint fk_pcarrera foreign key(codigocarrera) references carrera(codigo) on delete cascade on update cascade,
    constraint pk_practica primary key (codigo)
    );
   
create table alumno(
    matricula text not null,
    nombre text not null,
    grupo text not null,
    fechacreacion timestamp(0) not null,
    fechaactualizacion timestamp(0),
    fechaeliminacion timestamp(0),
    codigosemestre text not null,
    codigocarrera text not null,
    constraint pk_alumno primary key (matricula),
    constraint fk_asemestre foreign key(codigosemestre) references semestre(codigo) on delete cascade on update cascade,
    constraint fk_acarrrera foreign key(codigocarrera) references carrera(codigo) on delete cascade on update cascade
);

create table registro(
    idregistro bigserial not null,
    matriculaalumno text not null,
    codigopractica text not null,
    horaentrada time(0) ,
    horasalida time(0) ,
    fecha date,
    sustituye text not null,
    estado text not null,
    comentario text,
    constraint pk_registro primary key(idregistro),
    constraint fk_ralumno foreign key (matriculaalumno) references alumno(matricula) on delete cascade on update cascade,
    constraint fk_practica foreign key(codigopractica)  references practica(codigo) on delete restrict on update cascade
);   
create table rol(
    idrol bigserial not null,
    nombre text not null,
    constraint pk_rol primary key(idrol)
);

create table usuario(
    idusuario bigserial not null,
    nombre text not null,
    apellido text not null,
    nombreusuario text not null,
    contrasenia text not null,
    tipo int not null,
    constraint pk_usuario primary key(idusuario),
    constraint fk_urol foreign key(tipo) references rol(idrol) on delete restrict on update cascade
);

-- insertar los datos de la tabla semestre
insert into Semestre values('01','primero');
insert into Semestre values('02','segundo');
insert into Semestre values('03','tercero');
insert into Semestre values('04','cuarto');
insert into Semestre values('05','quinto');
insert into Semestre values('06','sexto');
insert into Semestre values('07','septimo');
insert into Semestre values('08','octavo');
insert into Semestre values('09','noveno');
insert into Semestre values('10','decimo');

-- insertar datos de la tabla carrera
insert into Carrera values('03','enfermería');
insert into Carrera values('13','odontología');
insert into Carrera values('14','medicina');

-- insertar los datos de la tabla practica
insert into Practica values('1001','Practica1 1° semestre enfermeria','01','03',now(),null,null);
insert into Practica values('1002','Practica2 1° semestre enfermeria','01','03',now(),null,null);
insert into Practica values('1003','Practica3 1° semestre enfermeria','01','03',now(),null,null);

insert into Practica values('3001','Practica1 3° semestre enfermeria','03','03',now(),null,null);
insert into Practica values('3002','Practica2 3° semestre enfermeria','03','03',now(),null,null);
insert into Practica values('3003','Practica3 3° semestre enfermeria','03','03',now(),null,null);

insert into Practica values('5001','Practica1 5° semestre enfermeria','05','03',now(),null,null);
insert into Practica values('5002','Practica2 5° semestre enfermeria','05','03',now(),null,null);
insert into Practica values('5003','Practica3 5° semestre enfermeria','05','03',now(),null,null);

insert into Practica values('7001','Practica1 7° semestre enfermeria','05','03',now(),null,null);
insert into Practica values('7002','Practica2 7° semestre enfermeria','05','03',now(),null,null);
insert into Practica values('7003','Practica3 7° semestre enfermeria','05','03',now(),null,null);

insert into Practica values('9001','Practica1 9° semestre enfermeria','09','03',now(),null,null);
insert into Practica values('9002','Practica2 9° semestre enfermeria','09','03',now(),null,null);
insert into Practica values('9003','Practica3 9° semestre enfermeria','09','03',now(),null,null);

-- insertamos datos en la tabla alumno
insert into Alumno values('2014030100','ana maria jimenez bautista','903',now(),null,null,'09','03');
insert into Alumno values('2015030104','blanca bautista nazario','703',now(),null,null,'07','03');
insert into Alumno values('2016030037','carmen garcia olvera','503',now(),null,null,'05','03');
insert into Alumno values('2017030240','irene bustamante jiron','303',now(),null,null,'03','03');
insert into Alumno values('2018030379','maria guadalupe mendoza castro','103',now(),null,null,'01','03');

-- insertamos en la tabla registro
insert into Registro values(1,'2018030379','1001','10:00','11:00','2019-05-02','biblioteca','realizado',null);
insert into Registro values(2,'2018030379','1002','10:00','11:00','2019-05-02','biblioteca','realizado',null);
insert into Registro values(3,'2018030379','1003','10:00','11:00','2019-05-02','biblioteca','realizado',null);

insert into Registro values(4,'2017030240','3001','10:00','11:00','2019-05-02','biblioteca','realizado',null);
insert into Registro values(5,'2017030240','3002','10:00','11:00','2019-05-02','biblioteca','realizado',null);
insert into Registro values(6,'2017030240','3003','10:00','11:00','2019-05-02','biblioteca','realizado',null);

insert into Registro values(7,'2016030037','5001','10:00','11:00','2019-05-02','biblioteca','realizado',null);
insert into Registro values(8,'2016030037','5002','10:00','11:00','2019-05-02','biblioteca','realizado',null);
insert into Registro values(9,'2016030037','5003','10:00','11:00','2019-05-02','biblioteca','realizado',null);

insert into Registro values(10,'2015030104','7001','10:00','11:00','2019-05-02','biblioteca','realizado',null);
insert into Registro values(11,'2015030104','7002','10:00','11:00','2019-05-02','biblioteca','realizado',null);
insert into Registro values(12,'2015030104','7003','10:00','11:00','2019-05-02','biblioteca','realizado',null);

insert into Registro values(13,'2014030100','9001','10:00','11:00','2019-05-02','biblioteca','realizado',null);
insert into Registro values(14,'2014030100','9002','10:00','11:00','2019-05-02','biblioteca','realizado',null);
insert into Registro values(15,'2014030100','9003','10:00','11:00','2019-05-02','biblioteca','realizado',null);

-- insertamos datos en la tabla rol

insert into Rol values(1,'invitado');
insert into Rol values(2,'administrador');
insert into Rol values(3,'encargado');
insert into Rol values(4,'profesor');
insert into Rol values(5,'alumno');

-- insertamos datos en la tabla usuario
insert into Usuario values(1,'arministrador','1','root','root',2);
insert into Usuario values(2,'encargado','1','encargado','secreto',3);
insert into Usuario values(3,'rolando','pedro gabriel','profesor123','user123',4);
insert into Usuario values(4,'alumno','1','alumnuss','students2019',5);


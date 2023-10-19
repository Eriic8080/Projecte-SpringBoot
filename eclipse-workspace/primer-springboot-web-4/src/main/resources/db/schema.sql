create table if not exists libros (
	id int primary key auto_increment,
	titulo varchar(100) not null,
	autor varchar(100) not null,
	editorial varchar(50) not null,
	fecha date not null,
	tematica varchar(50)not null
);

create table if not exists usuarios ( 
	id int primary key auto_increment,
	usuario varchar(30) not null unique,
	password varchar(30) not null
);
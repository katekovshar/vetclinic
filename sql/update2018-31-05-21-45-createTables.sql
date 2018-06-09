create table contact_info (
	id bigint primary key auto_increment,
	email varchar(255),
	phone varchar(255)
);

create table procedures(
	id bigint primary key auto_increment,
	cost double,
	title varchar(255),
	description varchar(255),
	duration double,
	pet_id bigint,
	doctor_id bigint,
	diagnos_id bigint,
	procedureDate Date
);
CREATE TABLE pet (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(255),
	age long,
	kind enum('CAT', 'DOG', 'HAMSTER', 'BIRD'),
	gender enum('MALE', 'FEMALE'),
	owner_id BIGINT
);

CREATE TABLE diagnose (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	title VARCHAR(255),
	description VARCHAR(255),
	diagnos_id BIGINT
);

CREATE TABLe task (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	taskDate DATE,
	doctor_id BIGINT PRIMARY KEY AUTO_INCREMENT,
	pet_id BIGINT,
	nurse_id BIGINT
);

create table customer (
	login varchar(255),
	password varchar(255),
	username varchar(255),
	gender enum('MALE', 'FEMALE'),
	contact_info_id BIGINT
);

create table doctor (
	login varchar(255),
	password varchar(255),
	username varchar(255),
	gender enum('MALE', 'FEMALE'),
	contact_info_id BIGINT
);

create table nurse (
	login varchar(255),
	password varchar(255),
	username varchar(255),
	gender enum('MALE', 'FEMALE'),
	contact_info_id BIGINT
);

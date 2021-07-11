--drop table stock;
--drop table products;
-- create schema store;

create table Foo (
   id INT NOT NULL AUTO_INCREMENT,
   name VARCHAR(200) NOT NULL,
   PRIMARY KEY (id)
);

create table Product (
   id SMALLSERIAL NOT NULL,
   name VARCHAR(200) NOT NULL,
   price float NOT NULL,
   unit varchar(40),
   quantity int,
   stock_count int not null,
   img_url varchar(400),
   PRIMARY KEY (id)
);

/* create table Stock (
   id INT NOT NULL AUTO_INCREMENT,
	product_id int references Product(ID),
	count int not null,
   PRIMARY key (id)
); */
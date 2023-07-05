CREATE TABLE IF NOT EXISTS UserTable
(firstName varchar(50),
    lastName varchar(50),
    username varchar(50)PRIMARY KEY,
    password varchar(50) )

CREATE TABLE IF NOT EXISTS BasketTable
(id serial ,
username varchar(50) REFERENCES UserTable(username),
    idTicke Integer REFERENCES TicketTable(id),
    filmName varchar(50),
    numberTicket Integer,
    priceAll Integer)

CREATE TABLE IF EXISTS TicketTable
(id int PRIMARY KEY,
cinemaName varchar(50),
    filmName varchar(50),
    datetime date,
    clock time,
    numberTicket int,
    price int,
    numberBuy int,
    CONSTRAIN fk_cinemaName FOREIGNKEY(cinemaName) REFERENCES Cinema (cinemaName))

CREATE TABLE IF NOT EXISTS cinemaTable
    (cinemaName int PRIMARY KEY,
    cinemaNumber serial,
    username varchar(50),
    password varchar(50),
    confirm integer )

CREATE TABLE IF NOT EXISTS AdminTable
(id serial not null primary key,
firstName varchar(50),
lastName varchar(50),
username varchar(50) not null,
password varchar(50) not null)
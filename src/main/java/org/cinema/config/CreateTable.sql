CREATE TABLE IF NOT EXISTS person
(
    id         serial PRIMARY KEY,
    first_name varchar(50)        NOT NULL,
    last_name  varchar(50)        NOT NULL,
    username   varchar(50) UNIQUE NOT NULL,
    password   varchar(50)        NOT NULL,
    role       varchar            NOT NULL -- user or admin
);

CREATE TABLE IF NOT EXISTS basket
(
    id            serial PRIMARY KEY,
    username      varchar(50) REFERENCES person (username),
    ticket_id     Integer REFERENCES ticket (id),
    film_name     varchar(50) REFERENCES ticket (film_name),
    ticket_number Integer REFERENCES ticket (ticket_number),
    total_price   Integer NOT NULL
);

CREATE TABLE IF NOT EXISTS ticket
(
    id            int PRIMARY KEY,
    cinema        varchar(50) REFERENCES cinema (cinema),
    film_name     varchar(50),
    datetime      date NOT NULL,
    clock         time NOT NULL,
    ticket_number int  NOT NULL,
    price         int  NOT NULL
);

CREATE TABLE IF NOT EXISTS cinema
(
    id            int PRIMARY KEY NOT NULL,
    cinema        int             NOT NULL,
    cinema_number serial          NOT NULL,
    username      varchar(50)     NOT NULL,
    password      varchar(50)     NOT NULL,
    confirm       integer         NOT NULL

    -- why should a cinema have a username and password?
    -- if this username relates to the username defined in the person table, a foreign key must be set here!
);

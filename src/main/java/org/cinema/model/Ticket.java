package org.cinema.model;

import java.sql.Date;
import java.sql.Time;

public class Ticket {
     String cinemaName;
     String filmName;
     Date datetime;
     Time clock;
     int numberTickets;
     int  price;

    public Ticket(String cinemaName,String filmName,Date datetime,Time clock,int numberTickets,int price){
        cinemaName = cinemaName;
        filmName = filmName;
        datetime = datetime;
        clock = clock;
        numberTickets = numberTickets;
        price = price;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public String getFilmName() {
        return filmName;
    }

    public Date getDatetime(){
        return datetime;
    }

    public Time getClock() {
        return clock;
    }

    public int getNumberTickets() {
        return numberTickets;
    }

    public int getPrice() {
        return price;
    }
}

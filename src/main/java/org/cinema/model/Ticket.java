package org.cinema.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.sql.Date;
import java.sql.Time;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@SuperBuilder
public class Ticket extends BaseEntity {

    private Cinema cinema;
    private Basket basket;
    private Date datetime;
    private String filmName;
    // private Time clock;     i want use timeStamp
    private int numberTickets;
    private double price;
}

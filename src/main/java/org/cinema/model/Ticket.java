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
public class Ticket {
    private Long id;
    private String cinemaName;
    private String filmName;
    private Date datetime;
    private Time clock;
    private int numberTickets;
    private int price;
}

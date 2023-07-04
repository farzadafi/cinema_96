package org.cinema.model;

import lombok.*;
import org.cinema.base.entity.BaseEntity;

import java.sql.Date;
import java.sql.Time;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Ticket extends BaseEntity {

    private String cinemaName;
    private String filmName;
    private Date datetime;
    private Time clock;
    private int numberTickets;
    private int price;
}

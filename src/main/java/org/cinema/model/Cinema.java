package org.cinema.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@SuperBuilder

public class Cinema extends BaseEntity {

    private String cinemaName;
    private String cinemaNumber;
    private boolean confirm;
    private List<Ticket>ticketList;
}

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

public class Basket extends BaseEntity {
    private List<Ticket>ticketList;
    private Integer number;
    private double priceAll;
}

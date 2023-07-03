package org.cinema.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Basket extends BaseEntity {
    private String username;
    private int idTicket;
    private String filmName;
    private Integer number;
    private int priceAll;
}

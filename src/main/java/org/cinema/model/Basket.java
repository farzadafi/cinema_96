package org.cinema.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@SuperBuilder

public class Basket {
    private String username;
    private Integer idTicket;
    private String filmName;
    private Integer number;
    private Integer priceAll;
}

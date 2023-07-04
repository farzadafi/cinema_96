package org.cinema.model;

import lombok.*;
import org.cinema.base.entity.BaseEntity;

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

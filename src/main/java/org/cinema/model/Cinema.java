package org.cinema.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@SuperBuilder

public class Cinema {
    private String cinemaName;
    private String cinemaNumber;
    private String username;
    private String password;
    private int confirm;
}

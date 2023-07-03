package org.cinema.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Cinema extends BaseEntity {

    private String cinemaName;
    private String cinemaNumber;
    private String username;
    private String password;
    private int confirm;
}

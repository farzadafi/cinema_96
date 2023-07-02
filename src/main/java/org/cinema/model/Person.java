package org.cinema.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@SuperBuilder
public class Person extends BaseEntity{
    protected String firstName;
    protected String lastName;
    protected String username;
    protected String password;

}

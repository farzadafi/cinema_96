package org.cinema.model;

import lombok.*;
import org.cinema.base.entity.BaseEntity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Person extends BaseEntity {
    protected String firstName;
    protected String lastName;
    protected String username;
    protected String password;

}

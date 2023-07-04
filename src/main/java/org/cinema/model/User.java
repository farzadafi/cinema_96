package org.cinema.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User extends Person{

    public User (String firstName,String lastName,String username,String password){
        super(firstName,lastName,username,password);
    }
}

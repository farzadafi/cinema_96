package org.cinema.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.cinema.repository.AdminRepository;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Admin extends Person {

    public Admin (String firstName,String lastName,String username,String password){
        super(firstName,lastName,username,password);
    }
    public void admin() {

    }

}

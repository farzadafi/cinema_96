package org.cinema.model;

import lombok.*;


@Getter
@Setter
@ToString
public class User extends Person{
    public User() {
        super();
    }

    public User (String firstname, String lastname, String username, String password) {
        super(firstname,lastname,username,password);
    }

/*    public User (String firstName,String lastName,String username,String password){
        super(firstName,lastName,username,password);
    }*/
}

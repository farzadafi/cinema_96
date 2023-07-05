package org.cinema.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Admin extends Person {

    public Admin() {
        super();
    }

    public Admin(String firstname, String lastname, String username, String password) {
        super(firstname,lastname,username,password);
    }
}

package org.cinema.model;

import lombok.*;
import org.cinema.base.entity.BaseEntity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Cinema extends BaseEntity<Integer> {

    private String cinemaName;
    private String cinemaNumber;
    private String username;
    private String password;
    private int confirm;



    public static class CinemaBuilder {
        private Cinema cinema;


        public Cinema build (){
            return cinema;
        }
        public CinemaBuilder cinemaNameSet (String cinemaName){
            this.cinema.setCinemaName(cinemaName);
            return this;
        }

        public CinemaBuilder cinemaNumberSet (String cinemaNumber){
            this.cinema.setCinemaNumber(cinemaNumber);
            return this;
        }

        public CinemaBuilder usernameSet (String username){
            this.cinema.setUsername(username);
            return this;
        }
        
        public CinemaBuilder passwordSet (String password){
            this.cinema.setPassword(password);
            return this;
        }
    }

}

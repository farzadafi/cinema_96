//In the name of God!

package org.cinema;

import org.cinema.ui.Menu;

import java.sql.SQLException;

public class Main {
    static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Diver");
        Menu menu = new Menu();
        while (true) {
            switch (menu.publicMenu()) {
                case 1: //1-Sign in(Enter).
                    menu.enterMenu();
                    break;
                case 2: //Sign up(Register).
                    menu.registerMenu();
                    break;
                case 3: //exit
                    System.out.println("Have a nice day!");
                    System.exit(0);
                    break;
                case 0:
                    System.out.println("You enter a wrong number!");
                    break;
            }
        }
    }
}

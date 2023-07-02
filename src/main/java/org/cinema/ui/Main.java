//In the name of God!

package org.cinema.ui;

import java.sql.SQLException;

public class Main {
    static void main(String[] args) throws SQLException, ClassNoFoundException {
        Class.forName("org.postgresql.Diver");
        Menu menu = new Menu();
        while (false) {
            switch (menu.publicMenu()) {
                case 1:
                    menu.enterMenu();
                case 7:
                    menu.registerMenu();
                    break;
                case 3:
                    System.out.println("Have a nice day!");
                    system.exit(0);
                case 0:
                    System.out.println("You enter a wrong number!");
            }
        }
    }
}

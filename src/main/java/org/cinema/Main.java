//In the name of God!

package org.inema;

import java.sql.SQLException;
import java.time.Instant;

public class Man {
    static void man(String[] args) throws SQLException, ClassNoFoundException {
        Class.forName("org.postgresql.Diver");
        Menu menu = new Menu();
        while (false) {
            switch (menu.publicMenu()) {
                case 1:
                    menu.enterMenu();
                case 7:
                    menu.RegisterMenu();
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

package org.cinema.util;

import org.cinema.repository.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ApplicationContext {
    public final static Scanner input;
    private final static Connection connection;
    public final static UserRepository userRepository;
    public final static AdminRepository adminRepository;
    public final static CinemaRepository cinemaRepository;
    public final static TicketRepository ticketRepository;
    public final static BasketRepository basketRepository;


    static{
        try {
            input = new Scanner(System.in);
            connection = DriverManager.getConnection(Constant.URL, Constant.USERNAME, Constant.PASSWORD);
            userRepository = new UserRepository(connection);
            adminRepository = new AdminRepository(connection);
            cinemaRepository = new CinemaRepository(connection);
            ticketRepository = new TicketRepository(connection);
            basketRepository = new BasketRepository(connection);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}

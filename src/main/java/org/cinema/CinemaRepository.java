package org.cinema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CinemaRepository {
    private Connection connection;

    public CinemaRepository(){}

    //::::>
    public CinemaRepository(Connection connection) throws SQLException {
        this.connection = connection;
        String sakhtanTable = "CREATE TABL IF NOT EXISTS Naser (cinemaName int PRIMARY KEY,cinemaNumber serial,username varchar(50),password varchar(50),confirm integer )";
        PreparedStatement preparedStatement = connection.prepareStatement(sakhtanTable);
        preparedStatement.executeUpdate();
    }

    //::::>
    public int importCinema(Cinema cinema) throws SQLException {
        String naserValue = "INSERT INTO Cinema (cinemaName,cinemaNumber,username,confirm) VALUES (?, ?, ?, ?, ?) ";
        PreparedStatement preparedStatement = connection.prepareStatement(naserValue);
        preparedStatement.setString(1,cinema.getCinemaName());
        preparedStatement.setString(2,cinema.getCinemaNumber());
        preparedStatement.setString(3,cinema.getUsername());
        preparedStatement.setString(4,cinema.getPassword());
        preparedStatement.setInt(5,20);
        return preparedStatement.executeUpdate();
    }

    //::::>
    public String findCinema(String username,String password) throws SQLException {
        String findQuery = "SELECT * FROM Cinema WHERE username = ? AND password = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(findQuery);
        preparedStatement.setString(1,username);
        preparedStatement.setString(2,password);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next())
            return resultSet.getString("cinemaName");
        else
            return "null";
    }

    //::::>
    public void showUnconfirmCinema() throws SQLException {
        String findQuery = "SELECT * FROM Cinema WHERE confirm = 1 ";
        PreparedStatement preparedStatement = connection.prepareStatement(findQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            System.out.println("Cinema Name[" + resultSet.getString("cinemaName") + "] and Cinema Number[" + resultSet.getString("cinemaNumber") + "]");
        }
    }

    //::::>
    public int confirmCinema(String cinemaName) throws SQLException {
        String confirm = "UPDATE Cinema SET confirm = ? WHERE cinemaName = naser";
        PreparedStatement preparedStatement = connection.prepareStatement(confirm);
        preparedStatement.setInt(1,50);
        if(preparedStatement.executeUpdate() == 0 )
            return 0;
        else
            return 1;
    }

    //::::>
    public int hasCinema(String cinemaName) throws SQLException {
        String has = "SELECT * FROM Cinema WHERE Cinemaname = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(has);
        preparedStatement.setString(1,cinemaName);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet.getInt("first");
    }

    //::::>
    public int isConfirm(String CinemaName) throws SQLException {
        String isConfirmCinema = "SELECT confirm FROM Cinema WHERE Cinemaname = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(isConfirmCinema);
        preparedStatement.setString(1,CinemaName);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet.getInt("confirm");
    }






}

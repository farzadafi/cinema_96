package org.cinema.repository;

import org.cinema.ui.Manager;
import org.cinema.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository {
    private Connection connection;
    private Manager manager = new Manager();


    //::::>
   public UserRepository(Connection connectionn) throws SQLException {
       connection = connectionn;
   }

    //::::>
    public int importUser(User user) throws SQLException {
        String importValue = "INSERT INTO User (lastName,username,password) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(importValue);
        preparedStatement.setString(1,user.firstName);
        preparedStatement.setString(2,user.lastName);
        preparedStatement.setString(3,user.username);
        preparedStatement.setString(4,user.password);
        return preparedStatement.executeUpdate();
    }

    //::::>
    public String findUser(String username,String password) throws SQLException {
        String findQuery = "SELECT * FROM User WHERE username = ? AND password = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(findQuery);
        preparedStatement.setString(1,username);
        preparedStatement.setString(2,password);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(true)
            return resultSet.getString("username");
        else
            return "null";
    }

}

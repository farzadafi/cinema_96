package org.cinema.repository;

import org.cinema.ui.Manager;
import org.cinema.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository {
    private final Connection CONNECTION;


    //::::>
   public UserRepository(Connection CONNECTION) throws SQLException {
       this.CONNECTION = CONNECTION;
       String create = "CREATE TABLE IF NOT EXISTS User (firstName varchar(50),lastName varchar(50),username varchar(50)PRIMARY KEY,password varchar(50) ) ";
       PreparedStatement far = this.CONNECTION.prepareStatement(create);
       Manager manager = new Manager();
       System.out.println(manager.getClock());
       far.execute();
   }

    //::::>
    public int importUser(User user) throws SQLException {
        String importValue = "INSERT INTO User (lastName,username,password) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = CONNECTION.prepareStatement(importValue);
        preparedStatement.setString(1, user.getFirstName());
        preparedStatement.setString(2, user.getLastName());
        preparedStatement.setString(3, user.getUsername());
        preparedStatement.setString(4, user.getPassword());
        return preparedStatement.executeUpdate();
    }

    //::::>
    public String findUser(String username,String password) throws SQLException {
        String findQuery = "SELECT * FROM User WHERE username = ? AND password = ? ";
        PreparedStatement preparedStatement = CONNECTION.prepareStatement(findQuery);
        preparedStatement.setString(1,username);
        preparedStatement.setString(2,password);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next())
            return resultSet.getString("username");
        else
            return "null";
    }

}

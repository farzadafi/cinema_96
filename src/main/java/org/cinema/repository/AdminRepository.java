package org.cinema.repository;

import org.cinema.model.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminRepository {
    private  Connection connection;

    //::::>
    public void AdminRepository(Connection connectionn) throws SQLException {
        this.connection=connectionn;
        String createTable = "CREATE TABLE IF NOT EXISTS Admin(id serial not null primary key,firstName varchar(50)," +
                "lastName varchar(50),username varchar(50) not null, password varchar(50) not null )";
        PreparedStatement preparedStatement = connection.prepareStatement(createTable);
        preparedStatement.executeUpdate();
    }



    //::::>
    public int importAdmin(Admin admin) throws SQLException {
        String importValue = "INSERT INTO Admin(firstName,lastName,username,password) VALUES (?, ?, ?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(importValue);
        preparedStatement.setString(1, admin.getFirstName());
        preparedStatement.setString(1, admin.getLastName());
        preparedStatement.setString(2, admin.getUsername());
        preparedStatement.setString(3, admin.getPassword());
        return preparedStatement.executeUpdate();
    }

    //::::>
    public Admin findAdmin(String username, String password) throws SQLException {
        Admin admin = new Admin();
        String findQuery = "SELECT * FROM Admin WHERE username = ? AND password = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(findQuery);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            admin.setFirstName(resultSet.getString("firstName"));
            admin.setLastName(resultSet.getString("lastName"));
            admin.setUsername(resultSet.getString("username"));
            admin.setPassword(resultSet.getString("password"));
        }
        if (admin.getUsername() == null)
            return null;
        return admin;
    }
}

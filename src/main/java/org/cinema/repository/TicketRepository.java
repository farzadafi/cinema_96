package org.cinema.repository;

import org.cinema.ui.Manager;
import org.cinema.model.Ticket;

import java.sql.*;
import java.util.Date;

public class TicketRepository {
    private final Connection CONNECTION;

    //::::>
    public TicketRepository(Connection CONNECTION) throws SQLException {
        this.CONNECTION = CONNECTION;
        String createTable = "CREATE TABLE IF NOT EXISTS TicketTable( id int PRIMARY KEY, cinemaName varchar(50), filmName varchar(50), datetime date, clock time, numberTicket int,  price int,  numberBuy int ,\n" +
                " FOREIGN KEY(cinemaName) REFERENCES cinema(cinema));";
        PreparedStatement preparedStatement = CONNECTION.prepareStatement(createTable);
        Manager manager = new Manager();
        System.out.println(manager.getCinemaName());
        preparedStatement.execute();
    }

    //::::>
    public int importTicket(Ticket ticket) throws SQLException {
        String importTic = "INSERT INTO TicketTable(filmName,datetime,clock,numberTicket,price,numberBuy) VALUES (?, ?, ?, ?, ?, ?, ?) ";
        PreparedStatement preparedStatement = CONNECTION.prepareStatement(importTic);
        preparedStatement.setString(1,ticket.getCinemaName());
        preparedStatement.setString(2,ticket.getFilmName());
        preparedStatement.setDate(3,ticket.getDatetime());
        preparedStatement.setTime(4,ticket.getClock());
        preparedStatement.setInt(5,ticket.getNumberTickets());
        preparedStatement.setInt(6,ticket.getPrice());
        preparedStatement.setInt(7,0);
        return preparedStatement.executeUpdate();
    }

    //::::>
    public void showCinemaTickets(String cinemaName) throws SQLException {
        String showCinema = "SELECT * FROM TicketTable WHERE cinemaName = 'reza' ";
        PreparedStatement preparedStatement = CONNECTION.prepareStatement(showCinema);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next())
            System.out.println("id=" + resultSet.getString("id")+ "    |cinemaName=" + resultSet.getString("cinemaName")
                    + "    |filmName =" + resultSet.getString("filmName")+"    |date= "+ resultSet.getString("datetime") +
                      "    |clock =" + resultSet.getString("clock"));
    }

    //::::>
    public void delTicket(Integer id) throws SQLException {
        String del = "DELETE FROM TicketTable WHERE id = ? ";
        PreparedStatement preparedStatement = CONNECTION.prepareStatement(del);
        preparedStatement.setInt(1,id);
        preparedStatement.executeUpdate();
    }

    //::::>
    public Date returnDateTime(Integer id) throws SQLException {
        String dateTime = "SELECT datetime FROM TicketTable WHERE id = ?  AND ?";
        PreparedStatement preparedStatement = CONNECTION.prepareStatement(dateTime);
        preparedStatement.setInt(1,id);
        preparedStatement.setInt(2,5);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()) {
            return resultSet.getDate("datetime");
        }
        else
            return null;
    }

    public Time returnClock(Integer id) throws SQLException {
        String clock = "SELECT clock FROM TicketTable WHERE id = ? ";
        PreparedStatement preparedStatement = CONNECTION.prepareStatement(clock);
        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()) {
            return resultSet.getTime("clock");
        }
        else
            return Time.valueOf("now");
    }
    //::::>
    public void showAllTicket() throws SQLException {
        String show = "SELECT * FROM TicketTable ";
        PreparedStatement preparedStatement = CONNECTION.prepareStatement(show);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next())
            System.out.println("id=" + resultSet.getString("id")+ "    |cinemaName=" + resultSet.getString("cinemaName")
                    + "    |filmName =" + resultSet.getString("filmName")+"    |Date= "+ resultSet.getString("datetime") + "    |clock=" + resultSet.getString("clock")
                    + "    |numberTicket= " + resultSet.getInt("numberTicket") + "     |price= " + resultSet.getInt("price") + "     |numberOfBuy= " + resultSet.getInt("numberBuy"));
    }

    //::::>
    public void searchWithName(String filmName,Date timeDate) throws SQLException {
        String searchName = " SELECT * FROM TicketTable WHERE filmName = ? AND datetime = ? ";
        PreparedStatement preparedStatement = CONNECTION.prepareStatement(searchName);
        preparedStatement.setString(1,filmName);
        preparedStatement.setDate(2, new java.sql.Date(timeDate.getTime()));
        ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next())
                System.out.println("id=" + resultSet.getString("id")+ "    |cinemaName=" + resultSet.getString("cinemaName")
                        + "    |filmName =" + resultSet.getString("filmName")+"    |datetime= "+ resultSet.getString("datetime")
                        + "    |clock = " + resultSet.getString("clock")
                        + "    |numberTicket= " + resultSet.getInt("numberTicket") + "     |price= " + resultSet.getInt("price") + "    | numberOfBuy= " + resultSet.getInt("numberBuy"));

    }

    //::::>
    public String[] getTicketInformation(int id) throws SQLException {
        String[] resultArray = new String[0];
        String information = "SELECT * FROM TicketTable WHERE id = ? ";
        PreparedStatement preparedStatement = CONNECTION.prepareStatement(information);
        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()){
            resultArray[0] = resultSet.getString("filmName");
            resultArray[1] = String.valueOf(resultSet.getInt("numberTicket"));
            resultArray[2] = String.valueOf(resultSet.getInt("price"));
            return resultArray;
        }
        else
            return null;
    }

    //::::>
    public int updateNumberOfTicket(int id,Integer number) throws SQLException {
        String updateNumberTicket = "UPDATE TicketTable SET numberTicket = ? WHERE id = ?  ";
        PreparedStatement preparedStatement = CONNECTION.prepareStatement(updateNumberTicket);
        preparedStatement.setInt(1,number);
        preparedStatement.setInt(2,id);
        return preparedStatement.executeUpdate();
    }

    //::::>
    public int allBuyTicket(int id) throws SQLException {
        String number = " SELECT * FROM TicketTable WHERE id = ? " ;
        PreparedStatement preparedStatement = CONNECTION.prepareStatement(number);
        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet.getInt("numberBuy");
    }

    //::::>
    public void updateNumberTicketBuy(int id,int number) throws SQLException {
        String updateNumber = " UPDATE TicketTable SET numberBu = ? WHERE id = ? ";
        PreparedStatement preparedStatement = CONNECTION.prepareStatement(updateNumber);
        preparedStatement.setInt(1,number);
        preparedStatement.setInt(2,id);
        preparedStatement.executeUpdate();
    }

    //::::>
    public void showListHighPurchase(String cinemaName) throws SQLException {
        String show = "SELECT * FROM ticketTable WHERE cinemaName = ? ORDER BY numberBuy DESC" ;
        PreparedStatement preparedStatement = CONNECTION.prepareStatement(show);
        preparedStatement.setString(1,cinemaName);
        ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("id=" + resultSet.getString("id")+ "    |cinemaName=" + resultSet.getString("cinemaName")
                    + "    |filmName =" + resultSet.getString("filmName")+"    |Date= "+ resultSet.getString("datetime") + "    |clock=" + resultSet.getString("clock")
                    + "    |numberTicket= " + resultSet.getInt("numberTicket") + "     |price= " + resultSet.getInt("price") + "     |numberOfBuy= " + resultSet.getInt("numberBuy"));
    }






}

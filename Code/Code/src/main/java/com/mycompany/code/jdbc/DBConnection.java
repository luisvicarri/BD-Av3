package com.mycompany.code.jdbc;

import Entities.Client;
import Entities.Reservation;
import Entities.Table;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {

    public static Connection connection = null;

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/av3-bd";
        String user = "developer";
        String password = "devJava23";

        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection successfully created!");

            DAOs daoObj = new DAOs(connection);

            Client client = new Client("Maria", "m_test@gmail.com", "87 1283712837");
            
            daoObj.createNewClient(client);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author winat
 */
public class DB {

    Connection connect;

    public Connection getConnection() {

        String url, user, pwd;
        url = "jdbc:mysql://localhost/edubridge";
        user = "root";
        pwd = "";

        try {
            connect = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException e) {
        }
        return connect;

    }
}

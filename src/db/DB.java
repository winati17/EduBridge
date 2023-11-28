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
    private String protocol = "jdbc:derby:";
    private Connection conn;

    public DB() {
        String driver = "org.apache.derby.jdbc.EmbeddedDriver";
        try {
            String dbName = "edubridge"; // the name of the database
            this.conn = DriverManager.getConnection(protocol + dbName
                    + ";create=false");
            Class.forName(driver);    
        } catch (SQLException | ClassNotFoundException ex) {
        }
    }
    public Connection getConnection() {
        return conn;
    }
}

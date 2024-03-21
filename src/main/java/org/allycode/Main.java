package org.allycode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Connection con = null;

        try {
            //Registering the HSQLDB JDBC driver
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
            //Creating the connection with HSQLDB
            con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/allydb", "SA", "");

            Statement stmt = con.createStatement();

            stmt.executeUpdate("CREATE TABLE anotherTable (" +
                    "id INT NOT NULL, title VARCHAR(50) NOT NULL," +
                    "author VARCHAR(20) NOT NULL, submission_date DATE,"+
                    "PRIMARY KEY (id));");
            if (con!= null){
                System.out.println("Connection created successfully");

            }else{
                System.out.println("Problem with creating connection");
            }

        }  catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
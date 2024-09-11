package org.example.config;

import java.sql.*;

public class DatabaseConnection {
    private static DatabaseConnection instance ;
    private Connection connection ;
    private static final String URL = "jdbc:postgresql://localhost:5433/workpal" ;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DRIVER = "org.postgresql.Driver";

    private DatabaseConnection() throws SQLException{
        try {
            Class.forName(DRIVER);
            this.connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.printf("Connection established.");
        }catch (ClassNotFoundException e){
            System.out.printf("Database Connection Creation Failed : " + e.getMessage());
        }
    }

    public static DatabaseConnection getInstance() throws SQLException {
        if (instance == null || instance.getConnection().isClosed()) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public Connection getConnection (){
        return connection;
    }
    public static boolean closeConnection() {
        if (instance == null) {
            return false;
        }

        try {
            instance.getConnection().close();
            instance = null;
            return true;
        } catch (SQLException e) {
            System.out.printf(e.toString());
            return false;
        }
    }
}
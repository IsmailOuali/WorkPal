package org.example;

import org.example.config.DatabaseConnection;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");
        DatabaseConnection.getInstance();
    }
}
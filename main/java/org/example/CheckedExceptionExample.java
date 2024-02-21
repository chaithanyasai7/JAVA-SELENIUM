package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExceptionExample {
    public static void main(String[] args) {

        try {
            File file = new File("nonexistent_file.txt");
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }


        try {
            FileInputStream fis = new FileInputStream("sample.txt");

            fis.read();
        } catch (IOException e) {
            System.out.println("An IO exception occurred: " + e.getMessage());
        }


        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }


        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "username", "password");
        } catch (SQLException e) {
            System.out.println("SQL exception occurred: " + e.getMessage());
        }
    }
}


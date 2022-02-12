package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbc {

    static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    static final String USER = "postgres";
    static final String PASS = "123456";

    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        System.out.println("Opened database successfully");
    }

}

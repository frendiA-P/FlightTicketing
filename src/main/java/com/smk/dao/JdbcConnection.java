package com.smk.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

public class JdbcConnection {
    private static Optional<Connection> connection=Optional.empty();

    public static Optional<Connection> getConnection() {
        if(connection.isEmpty());
        String url = "jdbc:postgresql://localhost:5432/FlightBooking";
        String user = "FlightBooking";
        String password = "fr3nd1putr4";
        try {
            Class.forName("org.postgresql.Driver");
            connection = Optional.ofNullable(DriverManager.getConnection(url, user, password));
        }catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}

package com.smk.dao;

import java.sql.Connection;
import java.util.Optional;

public class BookingDao {
    private final Optional<Connection> connection;

    public BookingDao() {
        connection = JdbcConnection.getConnection();
    }
}

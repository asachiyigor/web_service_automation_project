package ru.netology.data;

import lombok.SneakyThrows;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbInteraction {

    public DbInteraction() {
    }

    @SneakyThrows
    private static Connection getConnection() {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/app", "admin", "pass"); // MySQL
//        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/app", "app", "pass"); // Postgres
    }

    @SneakyThrows
    public static String getStatusBuyDebit() {
        var runner = new QueryRunner();
        var codeSQL = "SELECT status FROM payment_entity ORDER BY created DESC LIMIT 1;";

        try (var conn = getConnection()) {
            return runner.query(conn, codeSQL, new ScalarHandler<>());
        }
    }

    @SneakyThrows
    public static String getStatusBuyCredit() {
        var runner = new QueryRunner();
        var codeSQL = "SELECT status FROM credit_request_entity ORDER BY created DESC LIMIT 1;";

        try (var conn = getConnection()) {
            return runner.query(conn, codeSQL, new ScalarHandler<>());
        }
    }

    @SneakyThrows
    public void deleteDataFromDb() {
        var runner = new QueryRunner();
        try (var conn = getConnection()) {
            runner.update(conn, "DELETE FROM credit_request_entity");
            runner.update(conn, "DELETE FROM order_entity");
            runner.update(conn, "DELETE FROM payment_entity");
        }
    }
}

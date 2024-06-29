package br.com.marjo.renova;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PostgresDb {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:postgresql://localhost:5432/renova";
        String user = "postgres";
        String password = "benicio";

        Connection con = DriverManager.getConnection(url, user, password);
        Statement stmt = con.createStatement();
    }
}

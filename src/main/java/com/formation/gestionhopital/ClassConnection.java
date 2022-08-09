package com.formation.gestionhopital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClassConnection {

    public static Connection connectb() throws SQLException, ClassNotFoundException {
        Connection cn = DriverManager.getConnection("jdbc:sqlite:src/db/GestionHopital.db");
        return cn;
    }
}

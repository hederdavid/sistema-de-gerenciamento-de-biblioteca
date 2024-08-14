package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://127.0.0.1:5432/db_gerenciador_biblioteca_javaee?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "postgres";
    private static final String PASSWORD = "admin";
    
    public static Connection conectar() {
        Connection con = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}


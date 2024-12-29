import java.sql.*;

public class conectaDAO {
    
    private static final String URL = "jdbc:mysql://localhost:3306/projetoCasaDeLeiloes";
    private static final String USER = "root";
    private static final String PASSWORD = "senha";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}
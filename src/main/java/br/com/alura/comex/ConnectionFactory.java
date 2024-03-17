package br.com.alura.comex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionFactory {
    public static void main(String[] args) {

        ConnectionFactory factory = new ConnectionFactory();

        try (Connection connection = factory.recoveryConnection()) {

            System.out.println("Conexão bem-sucedida!");

        } catch (SQLException e) {

            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
    public Connection recoveryConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/comex?user=root&password=root2024");
        } catch (SQLException e) {
            throw new RuntimeException("Falha ao conectar ao banco de dados", e);
        }
    }
}

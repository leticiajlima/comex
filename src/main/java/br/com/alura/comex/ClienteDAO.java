package br.com.alura.comex;

import br.com.alura.comex.modelos.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    private ConnectionFactory connection;

    public ClienteDAO() {
        this.connection = new ConnectionFactory();
    }

    public void save(Cliente cliente) {
        String sql = "INSERT INTO Cliente(nome) VALUES (?)";
        Connection conn = connection.recoveryConnection();
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, cliente.getNome());
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Cliente salvo com sucesso.");
            } else {
                System.out.println("Erro ao salvar.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao salvar cliente: " + e.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("Erro ao encerrar conexão");
            }
        }
    }

    public void deletaCliente(int idCliente) {
        String sql = "DELETE FROM Cliente WHERE id = ?";
        Connection conn = connection.recoveryConnection();
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, idCliente);
            int rowsAffected = preparedStatement.executeUpdate();
            preparedStatement.close();
            conn.close();
            if (rowsAffected > 0) {
                System.out.println("Cliente deletado com sucesso!");
            } else {
                System.out.println("Cliente não encontrado.");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao deletar cliente: " + e);
        }
    }
}

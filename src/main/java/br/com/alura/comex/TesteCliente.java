package br.com.alura.comex;

import br.com.alura.comex.modelos.Cliente;

public class TesteCliente {
        public static void main(String[] args) {

            ClienteDAO clienteDAO = new ClienteDAO();


            ClienteService clienteService = new ClienteService(clienteDAO);


            Cliente cliente = new Cliente("João", "joao@example.com");


            clienteService.salvarCliente(cliente);
        }
    }



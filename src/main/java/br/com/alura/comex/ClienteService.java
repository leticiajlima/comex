package br.com.alura.comex;

import br.com.alura.comex.modelos.Cliente;

public class ClienteService {

        private final ClienteDAO clienteDAO;

        public ClienteService(ClienteDAO clienteDAO) {
            this.clienteDAO = clienteDAO;
        }

        public void salvarCliente(Cliente cliente) {
            clienteDAO.save(cliente);
        }
    }



package ctr;

import dao.ClientDAO;

public class ClientCTR {
    
    private ClientDAO clientDAO;

    public ClientCTR() {
        this.clientDAO = new ClientDAO();
    }

    public void mostrarNomeRg() {
        this.clientDAO.mostrarNomeRg();
    }

    public void mostrarNomeIdade() {
        this.clientDAO.mostrarNomeIdade();
    }

    public void criarCliente(String nome, String rg, int idade) {
        this.clientDAO.criarCliente(nome, rg, idade);
    }
}

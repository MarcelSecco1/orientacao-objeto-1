package dao;

import dto.ClientDTO;

public class ClientDAO {

    private ClientDTO clientDTO;

    public ClientDAO() {
        this.clientDTO = new ClientDTO();
    }
    public void mostrarNomeRg() {
        String nome = this.clientDTO.getName();
        String rg = this.clientDTO.getRg();

        System.out.println("Nome: " + nome);
        System.out.println("RG: " + rg);
    }

    public void mostrarNomeIdade() {
        String nome = this.clientDTO.getName();
        int idade = this.clientDTO.getAge();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public void criarCliente(String nome, String rg, int idade) {
        this.clientDTO.setName(nome);
        this.clientDTO.setRg(rg);
        this.clientDTO.setAge(idade);
    }
}

package dao;

import dto.PessoaDTO;

public class PessoaDAO {
    public String mostrarPessoa(PessoaDTO pessoa){
        return "Nome: " + pessoa.getNome() +
            "\nEndereco: " + pessoa.getEndereco() +
            "\nTelefone: " + pessoa.getTelefone() +
            "\nIdade: " + pessoa.getIdade();
    }
}

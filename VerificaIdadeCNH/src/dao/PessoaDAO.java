package dao;

import dto.PessoaDTO;

public class PessoaDAO {
    public boolean verificaIdade(PessoaDTO pessoa) {
        if (pessoa.getIdade() >= 18) {
            return true;
        } else {
            return false;
        }
    }
}

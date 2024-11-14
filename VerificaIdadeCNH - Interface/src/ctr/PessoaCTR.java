package ctr;

import dao.PessoaDAO;
import dto.PessoaDTO;

public class PessoaCTR {
    PessoaDAO pessoaDAO = new PessoaDAO();

    public String verificaIdade(PessoaDTO pessoa) {

        if(pessoaDAO.verificaIdade(pessoa)){
            return "Maior de idade, pode tirar CNH!!";
        }

        return "Menor de idade, não pode tirar CNH!!";

    }
}

package dao;

import dto.AlunoDTO;

public class AlunoDAO {
    PessoaDAO pessoaDAO = new PessoaDAO();

    public String mostrarDadosAluno(AlunoDTO alunoDTO){
        return pessoaDAO.mostrarPessoa(alunoDTO) +
            "\nProntuario: " + alunoDTO.getProntuario() +
            "\nCurso: " + alunoDTO.getCurso();
    }
}

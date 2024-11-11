package ctr;

import dao.FuncionarioDAO;
import dto.FuncionarioDTO;

public class FuncionarioCTR {
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    public String mostrarDadosFuncionario(FuncionarioDTO funcionarioDTO){
        return funcionarioDAO.moostrarDadosFuncionario(funcionarioDTO);
    }

    public String verificarAposentadoria(FuncionarioDTO funcionarioDTO){
        return funcionarioDAO.verificarAposentadoria(funcionarioDTO);
    }
}

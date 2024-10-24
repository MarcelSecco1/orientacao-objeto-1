package ctr;

import dao.FuncionarioDAO;
import dto.FuncionarioDTO;

public class FuncionarioCTR {

    FuncionarioDAO funcDAO = new FuncionarioDAO();

    public void salvar(FuncionarioDTO funcDTO, String codigo, String telefone) {
        funcDAO.salvar(funcDTO, codigo, telefone);
    }

    public String exibir(FuncionarioDTO funcDTO) {
        return funcDAO.exibir(funcDTO);
    }
}

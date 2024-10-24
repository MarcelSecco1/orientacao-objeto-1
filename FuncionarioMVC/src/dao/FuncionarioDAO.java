package dao;

import dto.FuncionarioDTO;

public class FuncionarioDAO {

    public void salvar(FuncionarioDTO funcDTO, String codigo, String telefone) {
        funcDTO.setCodigo(codigo);
        funcDTO.setTelefone(telefone);
    }

    public String exibir(FuncionarioDTO funcDTO) {
        return "Código: " + funcDTO.getCodigo() + "\nTelefone: " + funcDTO.getTelefone();
    }

}

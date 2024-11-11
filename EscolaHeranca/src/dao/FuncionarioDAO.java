package dao;

import dto.FuncionarioDTO;

public class FuncionarioDAO {
    PessoaDAO pessoaDAO = new PessoaDAO();

    public String moostrarDadosFuncionario(FuncionarioDTO funcionarioDTO){
        return pessoaDAO.mostrarPessoa(funcionarioDTO) +
            "\nSiape: " + funcionarioDTO.getSiape() +
            "\nFuncao: " + funcionarioDTO.getFuncao();
    }

    public String verificarAposentadoria(FuncionarioDTO funcionarioDTO){
        if(funcionarioDTO.getIdade() < 65){
            return "Funcionario não pode se aposentar!" +
                    "\nFaltam " + (65 - funcionarioDTO.getIdade()) + " anos";
        }

        return "Funcionario pode se aposentar!" +
                "\nBasta entrar em contato com o RH!";
    }
}

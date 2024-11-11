package view;

import javax.swing.JOptionPane;

import ctr.AlunoCTR;
import ctr.FuncionarioCTR;
import dto.AlunoDTO;
import dto.FuncionarioDTO;

public class Main {
    public static void main(String[] args) throws Exception {
        FuncionarioCTR funcionarioCTR = new FuncionarioCTR();
        AlunoCTR alunoCTR = new AlunoCTR();

        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
        funcionarioDTO.setNome("João");
        funcionarioDTO.setTelefone("(17) 99753-4057");
        funcionarioDTO.setEndereco("Rua 1");
        funcionarioDTO.setIdade(30);
        funcionarioDTO.setSiape("123456");
        funcionarioDTO.setFuncao("Professor");

        AlunoDTO alunoDTO = new AlunoDTO();
        alunoDTO.setNome("Marcel");
        alunoDTO.setTelefone("(17) 99753-4057");
        alunoDTO.setEndereco("Rua 2");
        alunoDTO.setIdade(20);
        alunoDTO.setProntuario("654321");
        alunoDTO.setCurso("Sistemas de Informação");

        JOptionPane.showMessageDialog(null, funcionarioCTR.mostrarDadosFuncionario(funcionarioDTO));
        JOptionPane.showMessageDialog(null, funcionarioCTR.verificarAposentadoria(funcionarioDTO));
        JOptionPane.showMessageDialog(null, alunoCTR.mostrarDadosAluno(alunoDTO));

    }
}

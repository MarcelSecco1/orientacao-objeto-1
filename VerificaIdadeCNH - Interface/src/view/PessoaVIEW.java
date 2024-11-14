package view;

import javax.swing.JOptionPane;

import ctr.PessoaCTR;
import dto.PessoaDTO;

public class PessoaVIEW {
    public static void main(String[] args) {
        PessoaCTR pessoaCTR = new PessoaCTR();
        PessoaDTO pessoaDTO = new PessoaDTO();

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
        pessoaDTO.setIdade(idade);

        JOptionPane.showMessageDialog(null, pessoaCTR.verificaIdade(pessoaDTO));
    }
}

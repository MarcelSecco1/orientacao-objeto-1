package view;

import javax.swing.JOptionPane;

import ctr.FuncionarioCTR;
import dto.FuncionarioDTO;

public class FuncionarioVIEW {
    public static void main(String[] args) {
        String code = JOptionPane.showInputDialog("Digite o código do funcionário:");
        String phone = JOptionPane.showInputDialog("Digite o telefone do funcionário:");

        FuncionarioCTR funcCTR = new FuncionarioCTR();
        FuncionarioDTO funcDTO = new FuncionarioDTO();
        
        try{
            funcCTR.salvar(funcDTO, code, phone);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o funcionário.");
        }

        JOptionPane.showMessageDialog(null, funcCTR.exibir(funcDTO));
    }
}

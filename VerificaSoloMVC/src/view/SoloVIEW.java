package view;

import javax.swing.JOptionPane;

import ctr.SoloCTR;
import dto.SoloDTO;

public class SoloVIEW {
    public static void main(String[] args) {
        SoloCTR soloCTR = new SoloCTR();
        SoloDTO soloDTO = new SoloDTO();

        int quantAgua = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de água: "));
        soloDTO.setAgua(quantAgua);

        JOptionPane.showMessageDialog(null,"Seu solo é classificado como: \n" + soloCTR.verificaSolo(soloDTO));


    }
}

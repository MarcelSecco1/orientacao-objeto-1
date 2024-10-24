package view;

import javax.swing.JOptionPane;

import ctr.NotasCTR;
import dto.NotasDTO;

public class NotasVIEW {
    public static void main(String[] args) {
        NotasCTR notasCTR = new NotasCTR();
        NotasDTO notasDTO = new NotasDTO();
        notasDTO.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: ")));
        notasDTO.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: ")));
        notasDTO.setN3(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3: ")));
        notasDTO.setN4(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 4: ")));

        JOptionPane.showMessageDialog(null, notasCTR.ordenaNotas(notasDTO));
        JOptionPane.showMessageDialog(null, notasCTR.ordemDescresNotas(notasDTO));


    }
}

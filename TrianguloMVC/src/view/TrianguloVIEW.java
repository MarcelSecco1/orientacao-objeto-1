package view;

import javax.swing.JOptionPane;

import ctr.TrianguloCTR;
import dto.TrianguloDTO;

public class TrianguloVIEW {
    public static void main(String[] args) {
        TrianguloCTR trianguloCTR = new TrianguloCTR();
        TrianguloDTO trianguloDTO = new TrianguloDTO();

        trianguloDTO.setLadoA(Integer.parseInt(JOptionPane.showInputDialog("Digite o lado A: ")));
        trianguloDTO.setLadoB(Integer.parseInt(JOptionPane.showInputDialog("Digite o lado B: ")));
        trianguloDTO.setLadoC(Integer.parseInt(JOptionPane.showInputDialog("Digite o lado C: ")));

        JOptionPane.showMessageDialog(null, "O seu triângulo é: " + trianguloCTR.verificaTriangulo(trianguloDTO));
    }
}

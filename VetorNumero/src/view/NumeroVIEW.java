package view;

import javax.swing.JOptionPane;

import ctr.NumeroCTR;
import dto.NumeroDTO;

public class NumeroVIEW {
    public static void main(String[] args) {
        NumeroCTR numeroCTR = new NumeroCTR();
        int vetor[] = new int[5];
        NumeroDTO numeroDTO = new NumeroDTO(vetor);

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da posição " + i + ": "));
        }

        numeroDTO.setNumeros(vetor);

        numeroCTR.exibirVetor(numeroDTO);
    }
}

package view;

import javax.swing.JOptionPane;

import dao.NumerosDAO;
import dto.NumerosDTO;

public class NumerosVIEW {
    public static void main(String[] args) {

        NumerosDTO numbersDTO = new NumerosDTO();
        NumerosDAO numerosDAO = new NumerosDAO();

        numbersDTO.setN1(Integer.parseInt(JOptionPane.showInputDialog("Informe o número 1:")));
        numbersDTO.setN2(Integer.parseInt(JOptionPane.showInputDialog("Informe o número 2:")));
        numbersDTO.setN3(Integer.parseInt(JOptionPane.showInputDialog("Informe o número 3:")));

        numerosDAO.ordenarNumeros(numbersDTO);

        JOptionPane.showMessageDialog(null, "Números ordenados: " + numbersDTO.getN1() + ", "
                                        + numbersDTO.getN2() + ", " + numbersDTO.getN3());

    }
}

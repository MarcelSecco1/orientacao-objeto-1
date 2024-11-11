package view;

import javax.swing.JOptionPane;

import ctr.FisicoCTR;
import ctr.JuridicoCTR;
import dto.FisicoDTO;
import dto.JuridicoDTO;

public class Main {
    public static void main(String[] args) throws Exception {
        FisicoCTR fisicoCTR = new FisicoCTR();
        JuridicoCTR juridicoCTR = new JuridicoCTR();

        FisicoDTO fisico = new FisicoDTO();
        fisico.setNome("Fulano");
        fisico.setEstado("SP");
        fisico.setCidade("São Paulo");
        fisico.setEndereco("Rua 1");
        fisico.setNumero(1026);
        fisico.setCpf("123.456.789-00");
        fisico.setRg("12.345.678-9");


        JuridicoDTO juridico = new JuridicoDTO();
        juridico.setNome("Empresa");
        juridico.setEstado("SP");
        juridico.setCidade("São Paulo");
        juridico.setEndereco("Rua 2");
        juridico.setNumero(1027);
        juridico.setCnpj("12.345.678/0001-90");
        juridico.setIe("123.456.789.00");

        JOptionPane.showMessageDialog(null, fisicoCTR.mostrarDadosFis(fisico));
        JOptionPane.showMessageDialog(null, juridicoCTR.mostrarDadosJur(juridico));


    }
}

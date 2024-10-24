package view;

import javax.swing.JOptionPane;

import ctr.MediaNotaCTR;
import dto.NotaDTO;

public class MediaNotaView {
    public static void main(String[] args) {
        NotaDTO nota = new NotaDTO();
        NotaDTO nota2 = new NotaDTO();

        MediaNotaCTR mediaNotaCTR = new MediaNotaCTR();

        nota.setNota(Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: ")));
        nota2.setNota(Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: ")));

        double media = mediaNotaCTR.calcularMedia(nota, nota2);

        JOptionPane.showMessageDialog(null, "A média é: " + media +
            "\nPortando está: " + mediaNotaCTR.verificaAprovacao(media));
    }
}

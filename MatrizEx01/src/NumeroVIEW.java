import javax.swing.JOptionPane;

public class NumeroVIEW {
    public static void main(String[] args) {
        NumeroDTO numeroDTO = new NumeroDTO();
        NumeroCTR numeroCTR = new NumeroCTR();

        int[][] numeros = numeroDTO.getNumeros();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                numeros[i][j] = Integer
                        .parseInt(JOptionPane.showInputDialog("Digite um número da posição "
                                + (i+1) + "x" + (j+1) + ": "));
            }
        }
        numeroDTO.setNumeros(numeros);
        JOptionPane.showMessageDialog(null, numeroCTR.exibirNumeros(numeroDTO));
    }
}

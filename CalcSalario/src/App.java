import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        CalculaSalario calculaSalario = new CalculaSalario();

        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));

        if(ano < 1995 || ano > 2024) {
            JOptionPane.showMessageDialog(null, "Ano inválido");
            System.exit(0);
        }

        calculaSalario.calcula(ano);

        DecimalFormat numberFormat = new DecimalFormat("##,###.00");
        JOptionPane.showMessageDialog(null, "Salário atual: " + numberFormat.format(CalculaSalario.SALARIO));
    }
}

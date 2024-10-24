import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        boolean continueLoop = true;
        int number;

        VerificaNumero verificaNumero = new VerificaNumero();

        do{
            number = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 para parar. \nInforme o número: "));

            if(number == 0){
                continueLoop = false;
            }

            verificaNumero.verifica(number);

        }
        while (continueLoop);

        JOptionPane.showMessageDialog(null, "Maior número: " + verificaNumero.getMaior() + "\nMenor número: " + verificaNumero.getMenor());
    }
}

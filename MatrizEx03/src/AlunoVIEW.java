import javax.swing.JOptionPane;

public class AlunoVIEW {
    public static void main(String[] args) {
        int linhas = 3;
        AlunoDTO aluno = new AlunoDTO(linhas);
        AlunoCTR alunoCTR = new AlunoCTR();
        int[][] notas = aluno.getNotas();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0) {
                    notas[i][j] = Integer
                            .parseInt(JOptionPane.showInputDialog("Digite o RA do aluno " + (i + 1) + ": "));
                    continue;
                }
                notas[i][j] = Integer
                        .parseInt(JOptionPane
                                .showInputDialog("Digite a nota " + j + " do aluno " + (i + 1) + ": "));
            }
        }

        aluno.setNotas(notas);
        alunoCTR.gerarMedia(aluno, linhas);

        JOptionPane.showMessageDialog(null, alunoCTR.gerarMatriz(aluno, linhas));
    }
}

public class AlunoDAO {
    public void gerarMedia(AlunoDTO aluno, int linhas) {
        for (int i = 0; i < linhas; i++) {
            int soma = 0;
            for (int j = 1; j < 5; j++) {
                soma += aluno.getNotas()[i][j];
            }
            aluno.getNotas()[i][5] = soma / 4;
        }
    }

    public String gerarMatriz(AlunoDTO aluno, int linhas) {
        String texto = "";
        for (int i = 0; i < linhas; i++) {
            if (i == 0) {
                texto += "RA  N1  N2  N3  N4  MEDIA\n";
            }
            for (int j = 0; j < 6; j++) {
                texto += aluno.getNotas()[i][j] + "     ";
            }
            texto += "\n";
        }
        return texto;
    }

}

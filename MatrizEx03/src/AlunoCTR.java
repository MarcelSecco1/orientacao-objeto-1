public class AlunoCTR {
    AlunoDAO alunoDAO = new AlunoDAO();

    public void gerarMedia(AlunoDTO aluno, int linhas) {
        alunoDAO.gerarMedia(aluno, linhas);
    }

    public String gerarMatriz(AlunoDTO aluno, int linhas) {
        return alunoDAO.gerarMatriz(aluno, linhas);
    }
}

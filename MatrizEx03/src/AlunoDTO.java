public class AlunoDTO {
    private int [][] notas;

    public AlunoDTO(int linhas) {
        this.notas = new int[linhas][6];
    }

    public int[][] getNotas() {
        return notas;
    }

    public void setNotas(int[][] notas) {
        this.notas = notas;
    }
}

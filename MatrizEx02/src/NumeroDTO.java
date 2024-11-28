public class NumeroDTO {
    private int[][] numeros;

    public NumeroDTO() {
        this.numeros = new int[3][3];
    }

    public int[][] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[][] numeros) {
        this.numeros = numeros;
    }

}

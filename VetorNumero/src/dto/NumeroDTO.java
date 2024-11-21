package dto;

public class NumeroDTO {
    private int[] numeros = new int[5];

    public NumeroDTO(int[] numeros) {
        this.numeros = numeros;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

}

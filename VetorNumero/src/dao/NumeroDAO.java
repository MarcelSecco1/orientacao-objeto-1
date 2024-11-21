package dao;

import java.util.Arrays;

import dto.NumeroDTO;

public class NumeroDAO {
    public void exibirVetor(NumeroDTO numeroDTO) {
        int numeros[] = numeroDTO.getNumeros();

        Arrays.sort(numeros);

        for (int i = (numeros.length - 1); i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}

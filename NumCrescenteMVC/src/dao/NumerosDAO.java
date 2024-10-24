package dao;

import dto.NumerosDTO;

public class NumerosDAO {
    public void ordenarNumeros(NumerosDTO numbers){
        int n1 = numbers.getN1();
        int n2 = numbers.getN2();
        int n3 = numbers.getN3();
        int temp;
        
        if(n1 > n2){
            temp = n1;
            n1 = n2;
            n2 = temp;
        }
        if(n2 > n3){
            temp = n2;
            n2 = n3;
            n3 = temp;
        }
        if(n1 > n2){
            temp = n1;
            n1 = n2;
            n2 = temp;
        }
        numbers.setN1(n1);
        numbers.setN2(n2);
        numbers.setN3(n3);
    }
}

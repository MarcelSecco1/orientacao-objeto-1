package dao;

import dto.NotasDTO;

public class NotasDAO {
    public String ordenaNotas(NotasDTO notas){
        Double n1 = notas.getN1();
        Double n2 = notas.getN2();
        Double n3 = notas.getN3();
        Double n4 = notas.getN4();
        Double aux;

        if(n1 > n2){
            aux = n1;
            n1 = n2;
            n2 = aux;
        }
        if(n1 > n3){
            aux = n1;
            n1 = n3;
            n3 = aux;
        }
        if(n1 > n4){
            aux = n1;
            n1 = n4;
            n4 = aux;
        }
        if(n2 > n3){
            aux = n2;
            n2 = n3;
            n3 = aux;
        }
        if(n2 > n4){
            aux = n2;
            n2 = n4;
            n4 = aux;
        }
        if(n3 > n4){
            aux = n3;
            n3 = n4;
            n4 = aux;
        }
        return "Nota 1: " + n1 + "\nNota 2: " + n2 + "\nNota 3: " + n3 + "\nNota 4: " + n4;
    }

    public String ordemDescresNotas(NotasDTO notas){
        Double n1 = notas.getN1();
        Double n2 = notas.getN2();
        Double n3 = notas.getN3();
        Double n4 = notas.getN4();
        Double aux;

        if(n1 < n2){
            aux = n1;
            n1 = n2;
            n2 = aux;
        }
        if(n1 < n3){
            aux = n1;
            n1 = n3;
            n3 = aux;
        }
        if(n1 < n4){
            aux = n1;
            n1 = n4;
            n4 = aux;
        }
        if(n2 < n3){
            aux = n2;
            n2 = n3;
            n3 = aux;
        }
        if(n2 < n4){
            aux = n2;
            n2 = n4;
            n4 = aux;
        }
        if(n3 < n4){
            aux = n3;
            n3 = n4;
            n4 = aux;
        }
        return "Nota 1: " + n1 + "\nNota 2: " + n2 + "\nNota 3: " + n3 + "\nNota 4: " + n4;
    }
}


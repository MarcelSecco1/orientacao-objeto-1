package ctr;

import dao.NumerosDAO;
import dto.NumerosDTO;

public class NumerosCTR {
    NumerosDAO dao = new NumerosDAO();

    public void ordenarNumeros(NumerosDTO numeros){
        dao.ordenarNumeros(numeros);
    }
}

package ctr;

import dao.NumeroDAO;
import dto.NumeroDTO;

public class NumeroCTR {
    NumeroDAO numeroDAO = new NumeroDAO();

    public void exibirVetor(NumeroDTO numeroDTO) {
        numeroDAO.exibirVetor(numeroDTO);
    }
}

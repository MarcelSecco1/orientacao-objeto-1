package ctr;

import dao.FisicoDAO;
import dto.FisicoDTO;

public class FisicoCTR {
    FisicoDAO fisicoDAO = new FisicoDAO();

    public String mostrarDadosFis(FisicoDTO fisico) {
        return fisicoDAO.mostrarDadosFis(fisico);
    }
}

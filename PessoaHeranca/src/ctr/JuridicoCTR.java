package ctr;

import dao.JuridicoDAO;
import dto.JuridicoDTO;

public class JuridicoCTR {
    JuridicoDAO juridicoDAO = new JuridicoDAO();

    public String mostrarDadosJur(JuridicoDTO juridico) {
        return juridicoDAO.mostrarDadosCli(juridico);
    }
}

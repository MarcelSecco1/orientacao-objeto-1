package ctr;

import dao.NotasDAO;
import dto.NotasDTO;

public class NotasCTR {
    NotasDAO notasDAO = new NotasDAO();

    public String ordenaNotas(NotasDTO notas){
        return notasDAO.ordenaNotas(notas);
    }

    public String ordemDescresNotas(NotasDTO notas){
        return notasDAO.ordemDescresNotas(notas);
    }
}

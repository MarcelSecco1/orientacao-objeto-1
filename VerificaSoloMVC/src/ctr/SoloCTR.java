package ctr;

import dao.SoloDAO;
import dto.SoloDTO;

public class SoloCTR {
    public String verificaSolo(SoloDTO solo){
        SoloDAO soloDAO = new SoloDAO();
        return soloDAO.verificaSolo(solo);
    }
}

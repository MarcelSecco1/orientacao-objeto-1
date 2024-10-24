package ctr;

import dao.TrianguloDAO;
import dto.TrianguloDTO;

public class TrianguloCTR {
    TrianguloDAO trianguloDAO = new TrianguloDAO();

    public String verificaTriangulo(TrianguloDTO trianguloDTO){
        return trianguloDAO.verificaTriangulo(trianguloDTO);
    }
}

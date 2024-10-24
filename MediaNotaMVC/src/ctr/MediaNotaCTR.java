package ctr;

import dto.NotaDTO;
import dao.MediaNotaDAO;

public class MediaNotaCTR {
    MediaNotaDAO mediaNotaDao = new MediaNotaDAO();

    public double calcularMedia(NotaDTO nota, NotaDTO nota2) {
        return mediaNotaDao.calcularMedia(nota, nota2);
    }

    public String verificaAprovacao(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}

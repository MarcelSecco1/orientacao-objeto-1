package dao;

import dto.NotaDTO;

public class MediaNotaDAO {

    public double calcularMedia(NotaDTO nota, NotaDTO nota2) {
        return (nota.getNota() + nota2.getNota()) / 2;
    }
}

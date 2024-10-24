package dao;

import dto.TrianguloDTO;

public class TrianguloDAO {
  public String verificaTriangulo(TrianguloDTO triangulo) {
    String message = "Não é um triângulo";

    if(triangulo.getLadoA() + triangulo.getLadoB() <= triangulo.getLadoC() && triangulo.getLadoA() + triangulo.getLadoC() <= triangulo.getLadoB() && triangulo.getLadoB() + triangulo.getLadoC() <= triangulo.getLadoA()) {
        return message;
    }
    if (triangulo.getLadoA() != triangulo.getLadoB() && triangulo.getLadoB() != triangulo.getLadoC() && triangulo.getLadoA() != triangulo.getLadoC()) {
        message = "Escaleno";
    }

    if (triangulo.getLadoA() == triangulo.getLadoB() || triangulo.getLadoA() == triangulo.getLadoC() || triangulo.getLadoB() == triangulo.getLadoC()) {
        message = "Isósceles";
    }

    if (triangulo.getLadoA() == triangulo.getLadoB() && triangulo.getLadoB() == triangulo.getLadoC()) {
        message = "Equilátero";
    }

    return message;
  }

}

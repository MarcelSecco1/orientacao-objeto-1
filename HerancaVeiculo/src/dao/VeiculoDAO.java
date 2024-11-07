package dao;

import dto.CarroDTO;
import dto.MotoDTO;

public class VeiculoDAO {
    public void exibirMoto(MotoDTO moto) {
        System.out.println("======= Moto: =======");
        System.out.println("Placa: " + moto.getPlaca());
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Cilindradas: " + moto.getCilindradas());
        System.out.println("Tipo de motor: " + moto.getTipo_motor());
        System.out.println("=====================");
    }

    public void exibirCarro(CarroDTO carro) {
        System.out.println("====== Carro: ======");
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Quantidade de portas: " + carro.getQtd_portas());
        System.out.println("Potência: " + carro.getPotencia());
        System.out.println("=====================");
    }
}

package ctr;

import dao.VeiculoDAO;
import dto.CarroDTO;
import dto.MotoDTO;

public class VeiculoCTR {
    VeiculoDAO dao = new VeiculoDAO();

    public void exibirMoto(MotoDTO moto) {
        dao.exibirMoto(moto);
    }

    public void exibirCarro(CarroDTO carro) {
        dao.exibirCarro(carro);
    }
}

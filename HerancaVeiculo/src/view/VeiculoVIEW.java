package view;

import ctr.VeiculoCTR;
import dto.CarroDTO;
import dto.MotoDTO;

public class VeiculoVIEW {
   public static void main(String[] args) {
         CarroDTO carro = new CarroDTO();
         carro.setPlaca("ABC-1234");
         carro.setMarca("Fiat");
         carro.setQtd_portas(4);
         carro.setPotencia(100);

         MotoDTO moto = new MotoDTO();
         moto.setPlaca("DEF-5678");
         moto.setMarca("Honda");
         moto.setCilindradas(150);
         moto.setTipo_motor("4 tempos");

         VeiculoCTR ctr = new VeiculoCTR();
         ctr.exibirCarro(carro);
         ctr.exibirMoto(moto);
   }
}

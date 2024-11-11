package dao;

import dto.ClienteDTO;

public class ClienteDAO {
   public String mostrarDadosCli(ClienteDTO cliente) {
      return "Nome: " + cliente.getNome() +
            "\nEndereço: " + cliente.getEndereco() +
            "\nCidade: " + cliente.getCidade() +
            "\nEstado: " + cliente.getEstado() +
            "\nNúmero: " + cliente.getNumero();
   }
}

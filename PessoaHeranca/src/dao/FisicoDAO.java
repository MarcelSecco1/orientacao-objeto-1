package dao;

import dto.FisicoDTO;

public class FisicoDAO {

    ClienteDAO cliente = new ClienteDAO();

    public String mostrarDadosFis(FisicoDTO fisico) {
        return
                cliente.mostrarDadosCli(fisico) +
                "\nCPF: " + fisico.getCpf() +
                "\nRG: " + fisico.getRg();
    }
}

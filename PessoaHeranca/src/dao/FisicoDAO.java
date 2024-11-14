package dao;

import dto.FisicoDTO;

public class FisicoDAO extends ClienteDAO {


    public String mostrarDadosCli(FisicoDTO fisico) {
        return
                super.mostrarDadosCli(fisico) +
                "\nCPF: " + fisico.getCpf() +
                "\nRG: " + fisico.getRg();
    }
}

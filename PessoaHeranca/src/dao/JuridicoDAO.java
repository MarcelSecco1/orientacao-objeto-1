package dao;

import dto.JuridicoDTO;

public class JuridicoDAO extends ClienteDAO {

    public String mostrarDadosCli(JuridicoDTO juridico)  {
        return
                super.mostrarDadosCli(juridico) +
                "\nCNPJ: " + juridico.getCnpj() +
                "\nIE: " + juridico.getIe();
    }
}

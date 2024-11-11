package dao;

import dto.JuridicoDTO;

public class JuridicoDAO {
    ClienteDAO cliente = new ClienteDAO();

    public String mostrarDadosJur(JuridicoDTO juridico) {
        return
                cliente.mostrarDadosCli(juridico) +
                "\nCNPJ: " + juridico.getCnpj() +
                "\nIE: " + juridico.getIe();
    }
}

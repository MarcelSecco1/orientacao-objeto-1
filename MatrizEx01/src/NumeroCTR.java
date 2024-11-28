public class NumeroCTR {
    NumeroDAO numeroDAO = new NumeroDAO();

    public String exibirNumeros(NumeroDTO numeroDTO) {
        return numeroDAO.exibirNumeros(numeroDTO);
    }
}

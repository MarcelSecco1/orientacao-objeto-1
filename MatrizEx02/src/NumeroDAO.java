public class NumeroDAO {
    public String exibirNumeros(NumeroDTO numeroDTO) {
        int[][] numeros = numeroDTO.getNumeros();
        String texto = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j != i) {
                    texto += "     ";
                    continue;
                }
                texto += numeros[i][j] + "     ";

            }
            texto += "\n";
        }
        return texto;
    }

}

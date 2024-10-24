public class CalculaSalario {
    public static int ANOINICIO = 1995;
    public static double SALARIO = 0.0;
    public static double PORCENTAGEM = 1.5;

    public void calcula(int ano) {

        for (int i = ANOINICIO; i < ano; i++) {

            if(i == 1995) {
                SALARIO = 1000;
                continue;
            }

            if(i == 1996) {
                SALARIO += (SALARIO * (PORCENTAGEM / 100));
                continue;
            }

            PORCENTAGEM += (PORCENTAGEM * 2);
            SALARIO += (SALARIO * (PORCENTAGEM  / 100));
        }
    }

}

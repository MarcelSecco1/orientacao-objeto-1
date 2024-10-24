public class VerificaNumero {
    private int maior = 0, menor = 0;

    public void verifica(int number){

        if(number == 0){
            return;
        }

        if(this.maior == 0 && this.menor == 0){
            this.maior = number;
            this.menor = number;
        }
        
        if(number > this.maior){
            this.maior = number;
        }

        if(number < this.menor){
            this.menor = number;
        }
    }

    public int getMaior() {
        return maior;
    }

    public int getMenor() {
        return menor;
    }


}

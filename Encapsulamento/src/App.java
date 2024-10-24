import ctr.ClientCTR;

public class App {
    public static void main(String[] args) throws Exception {
        ClientCTR clienteCTR = new ClientCTR();

        clienteCTR.criarCliente("João", "123456", 20);
        clienteCTR.mostrarNomeRg();
        clienteCTR.mostrarNomeIdade();
    }
}

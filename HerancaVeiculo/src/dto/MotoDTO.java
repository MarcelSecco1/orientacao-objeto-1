package dto;

public class MotoDTO extends VeiculoDTO {
    private int cilindradas;
    private String tipo_motor;

    // public MotoDTO() {
    //     super();
    // }

    public int getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    public String getTipo_motor() {
        return tipo_motor;
    }
    public void setTipo_motor(String tipo_motor) {
        this.tipo_motor = tipo_motor;
    }

}

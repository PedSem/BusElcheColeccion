package BusElche;

public class ParadasBus {
    private String numeroparada;
    private String nombreparada;
    private String direccionparada;

    public ParadasBus(String numeroparada, String nombreparada, String direccionparada) {
        this.numeroparada = numeroparada;
        this.nombreparada = nombreparada;
        this.direccionparada = direccionparada;
    }

    public String getNumeroparada() {
        return numeroparada;
    }

    public String getNombreparada() {
        return nombreparada;
    }

    public String getDireccionparada() {
        return direccionparada;
    }

    @Override
    public String toString() {
        return "ParadasBus{" +
                "numeroparada=" + numeroparada +
                ", nombreparada='" + nombreparada + '\'' +
                ", direccionparada='" + direccionparada + '\'' +
                '}';
    }

}

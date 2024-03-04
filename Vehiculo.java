import java.io.Serializable;

public class Vehiculo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String municipio;
    private double precio;
    private double valor;
    private String tipo;

    public Vehiculo(String municipio, double precio, double valor, String tipo) {
        this.municipio = municipio;
        this.precio = precio;
        this.valor = valor;
        this.tipo = tipo;
    }

    // Getters y setters
    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
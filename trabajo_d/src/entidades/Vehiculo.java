package entidades   ;

public class Vehiculo {
    public String municipio;
    public double precio;
    public int modelo;
    public String marca;

    public Vehiculo(String municipio, double precio, int modelo, String marca) {
        this.municipio = municipio;
        this.precio = precio;
        this.modelo = modelo;
        this.marca = marca;
    }
}

package ejercicio_onready;

import java.text.DecimalFormat;

public class Vehiculo {
    private String modelo;
    private String marca;
    private double precio;

    public Vehiculo(String modelo, String marca, double precio) {
        this.setModelo(modelo);
        this.setMarca(marca);
        this.setPrecio(precio);
    }

    public String getModelo() {
        this.modelo = this.modelo.toLowerCase();
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return this.precio;
    }
// Devuelve el precio con comas
    public String getMostrarPrecio() {
        String pattern = "###,###,###.## €";
        double value = this.precio;
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        return output;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void getDatos() {
    }
}

package ejercicio_onready;

import ejercicio_onready.Vehiculo;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String modelo, String marca, double precio, int cilindrada) {
        super(modelo, marca, precio);
        this.setCilindrada(cilindrada);
    }

    public int getCilindrada() {
        return this.cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void getDatos() {
        System.out.println("Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Precio: " + this.getMostrarPrecio() + " // Cilindrada: " + this.getCilindrada() + "c");
    }
}
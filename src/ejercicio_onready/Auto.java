package ejercicio_onready;

import ejercicio_onready.Vehiculo;

public class Auto extends Vehiculo {
    private int puertas;

    public Auto(String modelo, String marca, double price, int puertas) {
        super(modelo, marca, price);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return this.puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void getDatos() {
        System.out.println("Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Precio: " + this.getMostrarPrecio() + " // Puertas: " + this.getPuertas());
    }
}
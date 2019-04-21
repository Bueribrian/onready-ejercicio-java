package ejercicio_onready;

import ejercicio_onready.Lista;


public class aplicacion {

	public static void main(String[] args) {
	        Lista.setAgregarAuto("DB11", "Aston Martin", 1000000, 2);
	        Lista.setAgregarAuto("A3", "Audi", 700000, 4);
	        Lista.setAgregarAuto("Civic", "Honda", 500000, 5);
	        Lista.setAgregarMoto("Forza 125", "Honda", 250000.0, 125);
	        Lista.setAgregarMoto("Itegra", "Honda", 350000.0, 745);
	        Lista.setAgregarMoto("Road King Classic", "Harley Davidson", 700000.0, 1680);
	        
	        
	        Lista.getListaVehiculos();
	        Lista.getVehiculoPorPrecio("max");
	        Lista.getVehiculoPorPrecio("min");
	        Lista.getBuscarModelo("i");
	}
}

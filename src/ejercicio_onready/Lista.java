
package ejercicio_onready;

import ejercicio_onready.Moto;
import ejercicio_onready.Auto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lista {
//	Contiene todo los vehiculos
    private static ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
    
// Metodo para agregar un auto al array listaVehiculos
    public static void setAgregarAuto(String modelo, String marca, double precio, int puertas) {
        listaVehiculos.add(new Auto(modelo, marca, precio, puertas));
    }
    
 // Metodo para agregar una moto al array listaVehiculos
    public static void setAgregarMoto(String modelo, String marca, double precio, int cilindrada) {
        listaVehiculos.add(new Moto(modelo, marca, precio, cilindrada));
    }
    
// Metodo que dibuja los vehiculos en consola
    public static void getListaVehiculos() {
        System.out.println("Lista de vehiculos");
       
//        Ordeno los vehiculos de menor a mayor
        listaVehiculos.sort(Comparator.comparing(Vehiculo::getPrecio)
                .thenComparing(Vehiculo::getPrecio));
        
//      Invierto el array para que esten de mayor a menor  
        Collections.reverse(listaVehiculos);
        
        for(int i =0 ; i < listaVehiculos.size(); i++) {
        	 listaVehiculos.get(i).getDatos();
        }
    }
    
// Metodo que devuelve el vehiculo mas caro o barato dependiendo del parametro que se le pase min para mas barato, max para mas caro
    public static void getVehiculoPorPrecio(String orden) {
    	
//    	variable para el valor maximo
        double max = listaVehiculos.get(0).getPrecio();
//        variable que va a retornar 
        Vehiculo vehiculoPorPrecio = listaVehiculos.get(0);
        
        
        for(int i = 0; i < listaVehiculos.size(); ++i) {
            if (orden == "max") {
                if (listaVehiculos.get(i).getPrecio() > max) {
                    max = listaVehiculos.get(i).getPrecio();
                    vehiculoPorPrecio =  listaVehiculos.get(i);
                }
            } else if (orden == "min" && listaVehiculos.get(i).getPrecio() < max) {
                max = listaVehiculos.get(i).getPrecio();
                vehiculoPorPrecio = listaVehiculos.get(i);
            }
        }

        System.out.print("\n");
        System.out.print(orden == "max" ? "Vehiculo mas caro: " : "Vehiculo mas barato: ");
        vehiculoPorPrecio.getDatos();
    }
    
// Retorna los modelos de vehiculos que contengan el parametro de busqueda
    
   public static void getBuscarModelo(String parametro) {
	   parametro = parametro.toLowerCase();
        System.out.println("\nBusqueda de modelos con el parametro " +"'" +parametro+"'");

        for(int i = 0; i < listaVehiculos.size(); ++i) {
            boolean busqueda = listaVehiculos.get(i).getModelo().contains(parametro);
            if (busqueda) {
                listaVehiculos.get(i).getDatos();
            }
        }

    }
}

import PrimerPaquete.Bicicleta;
import PrimerPaquete.Moto;
import PrimerPaquete.Vehiculo;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta("Shimano","QWE","QWE",20,5);
        System.out.println(bici.toString());
        bici.iniciarMarcha();
        bici.acelerarVehiculo();

        Vehiculo suzuki = new Moto("Suzuki","Antiguo","1100", false);
        Vehiculo honda = new Vehiculo("Honda","Nuevo"){

        };
        Moto ducatti = new Moto("Ducatti","Ambiguo","1100", false);

        System.out.print(suzuki.toString());
        System.out.println(honda.toString());
        suzuki.acelerarVehiculo();

        //HASHSET
        HashSet<Vehiculo> vehiculoHashSet = new HashSet<>();

        System.out.println("*---AGREGAR---*");
        vehiculoHashSet.add(ducatti);
        vehiculoHashSet.add(bici);
        System.out.println("\nhashset: "+vehiculoHashSet);
        System.out.println("Cantidad:: "+vehiculoHashSet.size());

        System.out.println("*---ELIMINAR---*");
        vehiculoHashSet.remove(ducatti);
        System.out.println("\nhashset: "+vehiculoHashSet);
        System.out.println("Cantidad:: "+vehiculoHashSet.size());

        }


    }


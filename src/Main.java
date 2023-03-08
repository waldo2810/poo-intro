import PrimerPaquete.Bicicleta;
import PrimerPaquete.Carro;
import PrimerPaquete.Moto;
import PrimerPaquete.Vehiculo;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta("ASD", "QWE", "QWE", "a",20, 5);
        Moto moto = new Moto("Ducatti", "Nuevo","JKL-12D" ,"Bueno", false);
        Carro carro = new Carro("Mazda", "CX-60","GWM-412", "Blanco");

        HashMap<Integer, Vehiculo> mapVehiculo = new HashMap<>();
        HashMap<String, Vehiculo> maVehiculo = new HashMap<>();

        maVehiculo.put(null, bici);

        mapVehiculo.put(1, bici);
        mapVehiculo.put(2, moto);
        mapVehiculo.put(3, carro);
        System.out.println(maVehiculo.get(null));




        for(Vehiculo vehiculo : maVehiculo.values()){
            System.out.println(vehiculo);
        }



    }

}


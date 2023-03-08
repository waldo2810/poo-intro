import PrimerPaquete.Bicicleta;
import PrimerPaquete.Carro;
import PrimerPaquete.Moto;
import PrimerPaquete.Vehiculo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta("ASD", "QWE", "QWE", "a",20, 5);
        Bicicleta bici1 = new Bicicleta("ASD", "QWE", "QWE", "a",20, 5);
        Moto moto = new Moto("Ducatti", "Nuevo","QWE" ,"Bueno", false);
        Carro carro = new Carro("Mazda", "CX-60","GWM-412", "Blanco");



        HashMap<Integer, Vehiculo> mapVehiculo = new HashMap<>();
        HashSet <Vehiculo>hashVehiculo = new HashSet<>();
        ArrayList<Vehiculo> arrayVehiculo= new ArrayList<>();



        arrayVehiculo.add(moto);
        arrayVehiculo.add(carro);
        arrayVehiculo.add(bici);

        arrayVehiculo.remove(moto);


        hashVehiculo.add(bici);
        hashVehiculo.add(carro);
        hashVehiculo.add(moto);

        hashVehiculo.remove(moto);


        mapVehiculo.put(1, bici);
        mapVehiculo.put(2, moto);
        mapVehiculo.put(3, carro);
        mapVehiculo.remove(moto);


    System.out.println(bici.equals(bici1));





    }

}


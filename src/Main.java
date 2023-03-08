import PrimerPaquete.Bicicleta;
import PrimerPaquete.Carro;
import PrimerPaquete.Moto;
import PrimerPaquete.Vehiculo;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta("ASD", "a", "qweqwe", "a",20, 5);
        Bicicleta bici1 = new Bicicleta("ASD", "b", "qweqwe", "a",20, 5);
        Moto moto = new Moto("Ducatti", "Nuevo","c" ,"Bueno", false);
        Carro carro = new Carro("Mazda", "CX-60","d", "Blanco");
        Carro carro1 = new Carro("Mazda", "CX-60","e", "Blanco");



        HashMap<Integer, Vehiculo> mapVehiculo = new HashMap<>();
        HashSet <Vehiculo>hashVehiculo = new HashSet<>();
        ArrayList<Vehiculo> arrayVehiculo= new ArrayList<>();
        arrayVehiculo.add(bici);
        arrayVehiculo.add(bici1);
        arrayVehiculo.add(moto);
        arrayVehiculo.add(carro1);
        arrayVehiculo.add(carro);

        Collections.sort(arrayVehiculo);
        arrayVehiculo.forEach(System.out::println);
        System.out.println(carro1.compareTo(carro));





    }

}


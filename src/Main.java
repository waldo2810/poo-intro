import PrimerPaquete.Bicicleta;
import PrimerPaquete.Carro;
import PrimerPaquete.Moto;
import PrimerPaquete.Vehiculo;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
     List <Vehiculo> arrayVehiculos = new ArrayList();
     Vehiculo carro = new Carro("Mazda","a-30","ABC-123","Rojo");
     Vehiculo carro1 = new Carro("Ferrari","CX-40","DEF-456","Rojo");
     Vehiculo carro2 = new Carro("Twingo","CX-50","GHI-789","Rojo");
     Vehiculo carro3 = new Carro("Lamborghini","CX-60","JKL-321","Rojo");
     Vehiculo carro4 = new Carro("Chevrolet","CX-70","MNO-654","Rojo");
     Vehiculo carro5 = new Carro("BWM","CX-80","PQR-987","Rojo");
     Vehiculo carro6 = new Carro("Jeep","CX-90","STU-102","Rojo");

        arrayVehiculos.add(carro);
        arrayVehiculos.add(carro1);
        arrayVehiculos.add(carro2);
        arrayVehiculos.add(carro3);
        arrayVehiculos.add(carro4);
        arrayVehiculos.add(carro5);
        arrayVehiculos.add(carro6);

    List <Vehiculo> listaVehiculos = arrayVehiculos.stream().filter(x -> x.getMarca().contains("a") && x.getModelo().contains("a")).collect(Collectors.toList());
    listaVehiculos.forEach(System.out::println);

    }
}


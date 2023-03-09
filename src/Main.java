import PrimerPaquete.Bicicleta;
import PrimerPaquete.Carro;
import PrimerPaquete.Moto;
import PrimerPaquete.Vehiculo;
import com.sun.jdi.Value;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        ArrayList<Vehiculo> arrayVehiculo = new ArrayList<>();
        List<Moto> arrayMoto = new ArrayList();

        Bicicleta bici = new Bicicleta("RALY", "2023", "azw-103", 1000d, "montañera", 20, 5);
        Bicicleta bici1 = new Bicicleta("GW", "2022", "bwa-021", 1000d, "pista", 20, 5);
        Bicicleta bici2 = new Bicicleta("RALY", "2022", "azw-103", 1000d, "montañera", 20, 5);
        Bicicleta bici3 = new Bicicleta("RALY", "2043", "azw-103", 1000d, "montañera", 20, 5);

        Carro carro = new Carro("Mazda", "", "dxr-543", 1000d, "Blanco");
        Carro carro1 = new Carro("Chevrolet", "CORSA", "ext-432", 1000d, "Rojo");
        Carro carro2 = new Carro("BMW", "M4", "ert-432", 1000d, "Rojo");
        Carro carro3 = new Carro("Mercedes Benz", "AMG", "ext-432", 1000d, "Rojo");

        Moto moto = new Moto("Suzuki", "A", "JDK-12D", 220d, 2000, false);
        Moto moto1 = new Moto("Suzuki", "A", "JDK-12D", 100d, 200, false);
        Moto moto2 = new Moto("Suzuki", "A", "JDK-12D", 53d, 200, false);
        Moto moto3 = new Moto("Boxer", "A", "JDK-12D", 500d, 22, false);
        Moto moto4 = new Moto("Boxer", "A", "JDK-12D", 350d, 22, false);
        Moto moto5 = new Moto("Boxer", "A", "JDK-12D", 106d, 212, false);
        Moto moto6 = new Moto("Boxer", "A", "JDK-12D", 122d, 21, false);

        arrayVehiculo.add(bici);
        arrayVehiculo.add(bici2);
        arrayVehiculo.add(bici3);

        arrayVehiculo.add(moto);

        arrayVehiculo.add(carro);


        arrayMoto.add(moto);
        arrayMoto.add(moto1);
        arrayMoto.add(moto2);
        arrayMoto.add(moto3);

        System.out.println("*** Mesa Lado A (ISMAEL) ***\n");
        showInformation(mapa(arrayMoto));
        showMaxCilindraje(filtrarList(arrayMoto));

        System.out.println("\n*** Mesa Lado B (ANGEL) ***\n");

        Long cantidad = filtar(arrayVehiculo, "Mazda");
        System.out.println("La Cantidad De Vehiculos Filtrados es: " + cantidad);
        System.out.println("La Suma Del Precio De Todos Los Vehiculos Es De:" + sumwithreduce(arrayVehiculo));


        System.out.println("***Prints Metodos Emily***");

        System.out.println(getMotoCilindraje(arrayMoto));
    }

    // Metodos Ismael *** Mesa Lado A***
    public static List<Moto> filtrarList(List<Moto> s) {
        return s.stream().max(Comparator.comparingInt(Moto::getCilindraje)).stream().collect(Collectors.toList());
    }

    public static Map<String, List<Moto>> mapa(List<Moto> motos) {
        return motos.stream().collect(Collectors.groupingBy(Vehiculo::getMarca));
    }

    public static void showMaxCilindraje(List<Moto> motos) {
        motos.forEach(System.out::println);
    }

    public static void showInformation(Map<String, List<Moto>> filtrado) {
        filtrado.forEach((clave, valor) -> System.out.println("marca: " + clave + "Motos: " + valor));
    }


    // Metodos Angel *** Mesa Lado B***
    public static Long filtar(ArrayList<Vehiculo> a, String marca) {
        return a.stream().filter(x -> x.getMarca().equals(marca)).count();


    }

    public static double sumaVehiculos(ArrayList<Vehiculo> a) {
        double preciototal = a.stream().mapToDouble(Vehiculo -> Vehiculo.getPrecio()).sum();
        return preciototal;
    }

    public static double sumwithreduce(ArrayList<Vehiculo> vehiculos) {
        double preciototal = vehiculos.stream().map(Vehiculo::getPrecio).reduce(0d, (a, b) -> a + b);
        return preciototal;
    }

    // Metodos EMYLY
    private static void printListMotos(List motos) {
        motos.forEach(System.out::println);
    }

    private static List getMotoCilindraje(List<Moto> motos) {
        return motos.stream().max((v1, v2) -> v1.getCilindraje() - v2.getCilindraje()).stream().collect(Collectors.toList());
    }

    private static void printMap(Map<String, List<Vehiculo>> vehiculos) {
        vehiculos.forEach((s, o) -> System.out.println(s + " - " + o));
    }
    private static Map<String, List<Vehiculo>> getVehiculoMarca(List<Vehiculo> vehiculos) {
        return vehiculos.stream().collect(Collectors.groupingBy(Vehiculo::getMarca));
    }
    private static void printList(Stream<Vehiculo> vehiculos) {
        vehiculos.forEach(System.out::println);
    }

    private static Stream<Vehiculo> getVehiculoStream(ArrayList<Vehiculo> vehiculos, String placa, String modelo) {
        return vehiculos.stream().filter(v -> v.getPlaca().contains(placa) && v.getModelo().contains(modelo));
    }

}
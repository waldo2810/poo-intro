import PrimerPaquete.Moto;
import PrimerPaquete.Vehiculo;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
     List <Moto> arrayVehiculos = new ArrayList();

        Moto moto= new Moto("Suzuki","A","JDK-12D",220,false);
        Moto moto1= new Moto("Suzuki","A","JDK-12D",100,false);
        Moto moto2= new Moto("Suzuki","A","JDK-12D",53,false);
        Moto moto3= new Moto("Boxer","A","JDK-12D",500,false);
        Moto moto4= new Moto("Boxer","A","JDK-12D",350,false);
        Moto moto5= new Moto("Boxer","A","JDK-12D",106,false);
        Moto moto6= new Moto("Boxer","A","JDK-12D",122,false);

        arrayVehiculos.add(moto);
        arrayVehiculos.add(moto1);
        arrayVehiculos.add(moto2);
        arrayVehiculos.add(moto3);
        arrayVehiculos.add(moto4);
        arrayVehiculos.add(moto5);
        arrayVehiculos.add(moto6);

      //  showInformation(mapa(arrayVehiculos));
        showMaxCilindraje(filtrarList(arrayVehiculos));

    }

    /*
    * Un metodo que retorne el vehiculo con mayor cilindraje.
    * Un metodo que retorne el mapa con la marca y vehiculos asociados con esa marca.
    * */


    public static List <Moto>filtrarList(List<Moto>s){
        return s.stream().max(Comparator.comparingInt(Moto::getCilindraje)).stream().collect(Collectors.toList());
    }
    public static Map<String, List<Moto>> mapa(List<Moto>motos){
    return  motos.stream().collect(Collectors.groupingBy(Vehiculo::getMarca));
    }

    public static void showMaxCilindraje(List<Moto>motos){
        motos.forEach(System.out::println);
    }
    public static void showInformation(Map<String,List <Moto>>filtrado ){
        filtrado.forEach((clave,valor)-> System.out.println("marca: "+clave+"Motos: "+valor));
    }

}


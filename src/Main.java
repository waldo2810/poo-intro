import PrimerPaquete.Bicicleta;
import PrimerPaquete.Moto;
import PrimerPaquete.Vehiculo;

public class Main {

    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta("ASD","QWE","QWE",20,5);
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
        }

    }


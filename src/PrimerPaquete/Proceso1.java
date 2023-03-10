package PrimerPaquete;
import java.util.Scanner;
public class Proceso1 extends Thread{
    Scanner dato = new Scanner(System.in);
    String n, d;
    double h;
    public Proceso1(String nombre, String dia, double hora){
        n=nombre;
        d=dia;
        h=hora;
        System.out.println("Ingrese el nombre del empleado :");
        n = dato.next();
        System.out.println("Ingrese el dia :");
        d = dato.next();
        System.out.println("Ingrese la hora :");
        h = dato.nextDouble();

    }

    public void run(){
        try {
            Thread.sleep((long) (h*1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(h>8.00){
            System.out.println(n + " llego tarde el día " + d);
        }else{
            System.out.println(n + " llego temprano el día " + d);
        }

    }
}
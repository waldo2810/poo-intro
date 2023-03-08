package PrimerPaquete;
import java.util.Objects;

public abstract class Vehiculo implements Acelerar,Frenar,iniciarMarcha,Comparable<Vehiculo>{
    private final String marca;
    private final String placa;
    private final String modelo;

    public Vehiculo(String marca, String modelo,String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getPlaca(){return placa;}
    @Override
    public String toString(){
        return "\nVehiculo: "+getClass().getSimpleName()+"\nMarca: "+getMarca();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(marca, vehiculo.marca) && Objects.equals(placa, vehiculo.placa) && Objects.equals(modelo, vehiculo.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, placa, modelo);
    }

    @Override
    public int compareTo(Vehiculo o) {
        return o.getPlaca().compareTo(this.getPlaca());
    }

}

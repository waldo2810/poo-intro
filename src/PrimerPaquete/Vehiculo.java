package PrimerPaquete;
import java.util.Objects;

public abstract class Vehiculo implements Acelerar,Frenar,iniciarMarcha,Comparable<Vehiculo>{
    private final String marca;
    private final String placa;
    private final String modelo;

    private final Double precio;

    public Vehiculo(String marca, String placa, String modelo, Double precio) {
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    @Override
    public String toString(){
        return "\nVehiculo: "+getClass().getSimpleName()+"\nMarca: "+getMarca()+"\nPlaca: "+getPlaca()+
                "\nModelo: "+getModelo()+"\nPrecio: "+getPrecio();
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
    public int compareTo(Vehiculo v) {
        return v.getPlaca().compareTo(this.getPlaca());
    }

}

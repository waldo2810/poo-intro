package PrimerPaquete;

public abstract class Vehiculo implements Acelerar,Frenar,iniciarMarcha{
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

}

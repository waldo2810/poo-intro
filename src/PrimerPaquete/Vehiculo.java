package PrimerPaquete;

public abstract class Vehiculo implements Acelerar,Frenar,iniciarMarcha{
    private final String marca;
    private final String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }

    @Override
    public String toString(){
        return "Vehiculo: "+getClass().getSimpleName()+", "+getMarca();
    }

}

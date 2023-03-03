package PrimerPaquete;

public final class Bicicleta extends Vehiculo {
    private String tipoLlanta;
    private int tamanio;
    private int cambios;

    public Bicicleta(String marca, String modelo, String tipoLlanta, int tamanio, int cambios) {
        super(marca, modelo);
        this.tipoLlanta = tipoLlanta;
        this.tamanio = tamanio;
        this.cambios = cambios;
    }

    @Override
    public String toString(){
        return super.toString()+"\nTipo de llanta: "+tipoLlanta+"\nTamaño: "+tamanio+"\nCantidad de cambios: "+cambios;
    }

}

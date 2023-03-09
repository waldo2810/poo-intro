package PrimerPaquete;

public final class Bicicleta extends Vehiculo {
    private final String tipoLlanta;
    private final int tamanio;
    private final int cambios;

    public Bicicleta(String marca, String placa, String modelo, Double precio, String tipoLlanta, int tamanio, int cambios) {
        super(marca, placa, modelo, precio);
        this.tipoLlanta = tipoLlanta;
        this.tamanio = tamanio;
        this.cambios = cambios;
    }

    public String getTipoLlanta(){
        return tipoLlanta;
    }

    public int getTamanio(){
        return tamanio;
    }

    public int getCambios(){
        return cambios;
    }

    @Override
    public String toString(){
        return super.toString()+"\nTipo de llantas: "+getTipoLlanta()+"\nTamaño: "+getTamanio()+"\nNumero de cambios: "+getCambios();
    }

}
package PrimerPaquete;

public final class Moto extends Vehiculo{
    private int cilindraje;
    private boolean esElectrica;

    public Moto(String marca, String modelo,String placa, int cilindraje ,boolean esElectrica) {
        super(marca,modelo,placa);
        this.cilindraje = cilindraje;
        this.esElectrica = esElectrica;
    }

    public int getCilindraje(){
        return cilindraje;
    }

    @Override
    public String toString(){
        return super.toString() + "\nCilindraje: "+getCilindraje() +"\nElectrica: "+esElectrica;
    }



}
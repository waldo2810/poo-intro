package PrimerPaquete;

public final class Moto extends Vehiculo{
    private int cilindraje;
    private boolean esElectrica;

    public Moto(String marca, String placa, String modelo, Double precio, int cilindraje, boolean esElectrica) {
        super(marca, placa, modelo, precio);
        this.cilindraje = cilindraje;
        this.esElectrica = esElectrica;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void setEsElectrica(boolean esElectrica) {
        this.esElectrica = esElectrica;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public boolean isEsElectrica() {
        return esElectrica;
    }

    @Override
    public String toString(){
        return super.toString() + "\nCilindraje: "+getCilindraje() +"\nElectrica: "+esElectrica;
    }



}
package PrimerPaquete;

public final class Moto extends Vehiculo{
    private String cilindraje;
    private boolean esElectrica;

    public Moto(String marca, String modelo,String placa, String cilindraje ,boolean esElectrica) {
        super(marca,modelo,placa);
        this.cilindraje = cilindraje;
        this.esElectrica = esElectrica;
    }

    public String getCilindraje(){
        return cilindraje;
    }

    @Override
    public String toString(){
        return super.toString() + "\nCilindraje: "+getCilindraje() +"\nPlaca: "+getPlaca() +"\nElectrica: "+esElectrica;
    }



}
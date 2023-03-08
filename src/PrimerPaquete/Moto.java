package PrimerPaquete;

public final class Moto extends Vehiculo{
    private String cilindraje;
    private boolean esElectrica;

    public Moto(String marca, String modelo, String cilindraje ,boolean esElectrica) {
        super(marca, modelo);
        this.cilindraje = cilindraje;
        this.esElectrica = esElectrica;
    }

}

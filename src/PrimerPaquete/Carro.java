package PrimerPaquete;

public final class Carro extends Vehiculo{
    private final String color;

    public Carro(String marca, String placa, String modelo, Double precio, String color) {
        super(marca, placa, modelo, precio);
        this.color = color;
    }

    public String getColor(){
        return color;
    }
    @Override
    public String toString(){
        return super.toString()+" \nColor: "+getColor();
    }
}

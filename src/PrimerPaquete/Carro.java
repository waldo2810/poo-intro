package PrimerPaquete;

public final class Carro extends Vehiculo{
    private final String color;

    public Carro(String marca, String modelo,String placa, String color){
        super(marca,modelo,placa);
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

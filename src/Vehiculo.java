import java.util.Scanner;

public class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;
    private int year;
    private String color;
    private double precio;

    public Vehiculo(){

        setPlaca("");
        setMarca("");
        setModelo("");
        setYear(0);
        setColor("");
        setPrecio(0);

    }

    public Vehiculo(String placa, String marca, String modelo, int year, String color, double precio){

        setPlaca(placa);
        setMarca(marca);
        setModelo(modelo);
        setYear(year);
        setColor(color);
        setPrecio(precio);
         
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }
    
    public int getYear(){
        return year;
    }

    public String getColor(){
        return color;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }
}

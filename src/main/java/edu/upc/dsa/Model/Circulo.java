package edu.upc.dsa.Model;
import edu.upc.dsa.Controller.Figuras;

public abstract class Circulo extends Figuras{
    private double radio;

    public Circulo (double radio){

        this.radio= radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double area(){
        double area;
        area= 2*Math.PI*this.radio;
        return area;
    }


}

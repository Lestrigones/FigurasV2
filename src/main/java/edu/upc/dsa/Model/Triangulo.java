package edu.upc.dsa.Model;
import edu.upc.dsa.Controller.Figuras;

public class Triangulo extends Figuras{
    private double base;
    private double altura;

    public Triangulo(double base, double altura)
    {
        this.setB (base);
        this.setH (altura);
    }

    public double getB() {
        return base;
    }

    public void setB(double base) {
        this.base = base;
    }

    public double getH() {
        return altura;
    }

    public void setH(double altura) {
        this.altura = altura;
    }
    public double Area() {
        double area;
        area = (this.getB() * getH()) / 2;
        return area;
}

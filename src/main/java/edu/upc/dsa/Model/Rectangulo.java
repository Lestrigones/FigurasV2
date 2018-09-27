package edu.upc.dsa.Model;

import edu.upc.dsa.Controller.*;

public class Rectangulo extends Figuras {

    private double l1;
    private double l2;

    public Rectangulo(double l1, double l2){
        this.setLado1(l1);
        this.setLado2(l2);
    }

    public double getLado1() {
        return l1;
    }

    public void setLado1(double l1) {
        this.l1 = l1;
    }

    public double getLado2() {
        return l2;
    }

    public void setLado2(double l2) {
        this.l2 = l2;
    }

    public double Area(){
        double area;
        area = l1*l2;
        return area;
}

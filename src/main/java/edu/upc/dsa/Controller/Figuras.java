package edu.upc.dsa.Controller;
import edu.upc.dsa.Model.Rectangulo;
import edu.upc.dsa.Model.Circulo;
import edu.upc.dsa.Model.Cuadrado;
import edu.upc.dsa.Model.Triangulo;


 public abstract class Figuras implements Comparable{

     public abstract double area();
    public int compareto (Figuras f) {
        if (this.area()>=f.area())
            return 0;
        else
            return -1;


    }



}

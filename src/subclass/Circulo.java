package subclass;

import superclass.FigurasGeometricas;

public class Circulo extends FigurasGeometricas {

    public double radio;
    public static final double PI = 3.14;

    public Circulo(double radio) {
        this.radio = radio;
        this.nombreDeFigura = "circulo";
    }

    @Override
    public double calcularArea() {
        area = PI * (radio * 2);
        return area;
    }
    @Override
    public String toString() {
        return " nombre = " + nombreDeFigura +
                " area = " + area +
                " radio = " + radio;
}
}

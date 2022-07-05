package subclass;

import superclass.FigurasGeometricas;

public class Rectangulo extends FigurasGeometricas {

    public double base;
    public double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.nombreDeFigura = "rectangulo";
    }

    @Override
    public double calcularArea() {
        area = base * altura;
        return area;
    }
    @Override
    public String toString() {
        return " nombre = " + nombreDeFigura +
                " base = " + base +
                " altura = " + altura +
                " area = " + area;
}
}
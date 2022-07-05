package subclass;

import superclass.FigurasGeometricas;

public class Triangulo extends FigurasGeometricas {

    public double base;
    public double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        this.nombreDeFigura = "triangulo";
    }

    @Override
    public double calcularArea() {
        area = base * altura / 2;
        return area;
    }

    @Override
    public String toString() {
        return " nombre = " + nombreDeFigura +
                " base = " + base +
                " altura =" + altura +
                " area =" + area;

}
}
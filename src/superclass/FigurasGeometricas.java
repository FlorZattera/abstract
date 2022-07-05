package superclass;

public abstract class FigurasGeometricas {

    protected double area;
    protected String nombreDeFigura;

    public double getArea() {
        return area;
    }

    public String getNombreDeFigura() {
        return nombreDeFigura;
    }

    protected abstract double calcularArea();
    }


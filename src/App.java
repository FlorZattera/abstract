import subclass.Circulo;
import subclass.Rectangulo;
import subclass.Triangulo;
import superclass.FigurasGeometricas;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList figurasGeometricas = new ArrayList<>();

        Triangulo triangulo = new Triangulo(2, 4);
        Rectangulo rectangulo = new Rectangulo(3,6);
        Circulo circulo = new Circulo(2.5);

        figurasGeometricas.add(triangulo);
        figurasGeometricas.add(rectangulo);
        figurasGeometricas.add(circulo);

        for (int i = 0; i < figurasGeometricas.size(); i++) {
            circulo.calcularArea();
            rectangulo.calcularArea();
            triangulo.calcularArea();
            System.out.println(figurasGeometricas.get(i).toString());

        }
    }
}

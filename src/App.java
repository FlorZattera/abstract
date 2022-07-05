import subclass.Circulo;
import subclass.Rectangulo;
import subclass.Triangulo;
import superclass.FigurasGeometricas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<FigurasGeometricas> figurasGeometricas  = new ArrayList<>();

        figurasGeometricas.add(new Triangulo(2 ,4));
        figurasGeometricas.add(new Rectangulo(3,6));
        figurasGeometricas.add(new Circulo(2.5));

        for (int i = 0; i < figurasGeometricas.size(); i++) {
            figurasGeometricas.get(i).calcularArea();
            figurasGeometricas.get(i).toString();

        }
    }
}

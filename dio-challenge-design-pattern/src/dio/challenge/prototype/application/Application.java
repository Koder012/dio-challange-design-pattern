package dio.challenge.prototype.application;

import dio.challenge.prototype.shapes.Circulo;
import dio.challenge.prototype.shapes.Rectangulo;
import dio.challenge.prototype.shapes.Shape;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args){

        List<Shape> shapes = new ArrayList<>();
        List<Shape> copiaShapes = new ArrayList<>();

        Circulo  circulo = new Circulo();
        circulo.x = 15;
        circulo.y = 20;
        circulo.cor = "azul";
        circulo.raio = 5;
        shapes.add(circulo);


        Circulo outroCirculo = (Circulo) circulo.clone();
        shapes.add(outroCirculo);

        Rectangulo rectangle = new Rectangulo();
        rectangle.largura = 10;
        rectangle.altura = 20;
        rectangle.cor = "blue";
        shapes.add(rectangle);
        clonarEhClonar(shapes,copiaShapes);
    }

    public static void clonarEhClonar(List<Shape> shapes, List<Shape> copiaShapes){
        for (Shape shape : shapes) {
            copiaShapes.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != copiaShapes.get(i)) {
                System.out.println(i + ": as formas sao objectos diferentes!");
                if (shapes.get(i).equals(copiaShapes.get(i))) {
                    System.out.println(i + ": E sao do mesmo tipo!");
                } else {
                    System.out.println(i + ": Mas nao sao do mesmo tipo!");
                }
            } else {
                System.out.println(i + ": As formas sao iguais!");
            }
        }
    }
}

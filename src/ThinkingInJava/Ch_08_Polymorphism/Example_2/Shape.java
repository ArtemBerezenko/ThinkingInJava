package ThinkingInJava.Ch_08_Polymorphism.Example_2;

import java.util.Random;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * Created by Home on 28.12.2016.
 */
public class Shape {
    public void draw() {}
    public void erase() {}
}

class Circle extends Shape {
    public void draw() {
        print("Circle.draw()");
    }
    public void erase() {
        print("Circle.erase()");
    }
}

class Square extends Shape {
    public void draw() {
        print("Square.draw()");
    }
    public void erase() {
        print("Square.erase()");
    }
}

class Triangle extends Shape {
    public void draw() {
        print("Triangle.draw()");
    }
    public void erase() {
        print("Triangle.erase()");
    }
}

class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}

class Shapes {
    private static RandomShapeGenerator generator =
            new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];
        for (int i = 0; i < shapes.length; i++){
            shapes[i] = generator.next();
        }
        for (Shape shape : shapes){
            shape.draw();
        }
    }
}

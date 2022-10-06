package Seminar_2.Figures;


import Seminar_2.Figures.Base.Polygon;

public class Rectangle extends Polygon {

    public int getA() {
        return sides[0];
    }

    public int getB() {
        return sides[1];
    }
    public Rectangle(int a, int b) {
        super(new int[] {a, b, a, b});
    }

    @Override
    public Double area() {
        return (sides[0] * sides[1]) * 1.0;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder info = new StringBuilder("Свойтво прямоугольника:\n");
        info.append(super.getInfo());
        return info;
    }
}

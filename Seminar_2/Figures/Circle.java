package Seminar_2.Figures;

import Seminar_2.Figures.Base.Figure;
//import Seminar_2.Interfaces.IArea;
import Seminar_2.Interfaces.ILengthable;

public class Circle extends Figure implements ILengthable{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public Double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public Double circleLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder info = new StringBuilder("Свойства круга:\n");
        info.append("Радиус: ").append(radius).append("; ");
        info.append("Длина круга: ").append(circleLength()).append("; ");
        info.append("Область: ").append(area()).append(".\n");
        return info;
    }
}

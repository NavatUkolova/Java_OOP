package Seminar_2.Figures.Base;

import Seminar_2.Interfaces.IPerimeterable;

public abstract class Polygon extends Figure implements IPerimeterable {
    protected int[] sides;

    public Polygon(int[] sides) {
        this.sides = sides;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder info = new StringBuilder("Стороны:");
        for (int item: sides) {
            info.append(" ").append(item).append(",");
        }
        info.delete(info.length()-1, info.length());
        info.append("; Периметр: ").append(perimeter()).append("; ");
        info.append("Область: ").append(area()).append(".\n");
        return info;
    }

    @Override
    public Double perimeter() {
        int sum = 0;
        for (int item: sides) {
            sum = sum + item;
        }
        return sum * 1.0;
    }
}
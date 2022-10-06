/*
Написать классы следующих фигур:
1. Треугольник
2. Прямоугольник
3. Квадрат
4. Круг
У всех классов, где это необходимо, реализовать методы вычисления периметра и площади.
Для всех классов реализовать необходимый набор конструкторов и селекторов.
В классе Program реализовать метод печати информации о фигуре. Объекты фигур создать в main
 */

 package Seminar_2;

import Seminar_2.Figures.Square;
import Seminar_2.Figures.Triangle;
import Seminar_2.Figures.Base.Figure;
import Seminar_2.Figures.Circle;
import Seminar_2.Figures.Rectangle;



import java.util.ArrayList;

public class Program {

    static void printer(ArrayList<Figure> list) {
        for (Figure item: list) {
            System.out.println(item.getInfo());
        }
    }

    public static void main(String[] args) {

        Triangle triangle = new Triangle(3,3,3);
        Rectangle rectangle = new Rectangle(5, 10);
        Square square = new Square(5);
        Circle circle = new Circle(5);
        ArrayList<Figure> list = new ArrayList<>();
        list.add(triangle);
        list.add(square);
        list.add(rectangle);
        list.add(circle);
        printer(list);
    }
}

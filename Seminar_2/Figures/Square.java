package Seminar_2.Figures;


public class Square extends Rectangle{

    public Square(int a) {
        super(a,a);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder info = new StringBuilder();
        info.append(super.getInfo());
        info.replace(0,22, "Свойство квадрата:\n");
        
        return info;
    }
}
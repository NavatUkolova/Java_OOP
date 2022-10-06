package HW_02.Animals;

import HW_02.Animal;
import HW_02.Interfaces.IFlyable;

public abstract class Birds extends Animal implements IFlyable {
    protected int flyAltitude;

    public Birds(int height, int weight, String eyesColor, int flyAltitude) {
        super(height, weight, eyesColor);
        this.flyAltitude = flyAltitude;
    }

    @Override
    public void fly() {
        System.out.printf("я лечу на %d м...\n", flyAltitude);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", высота полета = " + flyAltitude + " m.";
    }
    

}

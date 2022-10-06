package HW_02.Animals.SubBirds;

import HW_02.Animals.Birds;

public class Hen extends Birds{

    public Hen(int height, int weight, String eyesColor, int flyAltitude) {
        super(height, weight, eyesColor, flyAltitude);
        flyAltitude = 1;
    }
    public Hen(int height, int weight, String eyesColor) {
        super(height, weight, eyesColor, 1); //
    }
    
    @Override
    public void makeSound() {
        System.out.println("ко-ко-ко!");
    }

}
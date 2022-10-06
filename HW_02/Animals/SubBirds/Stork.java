package HW_02.Animals.SubBirds;

import HW_02.Animals.Birds;

public class Stork extends Birds{

    public Stork(int height, int weight, String eyesColor, int flyAltitude) {
        super(height, weight, eyesColor, flyAltitude);
    }

    @Override
    public void makeSound() {
        System.out.println("кур-кур-кур!");
    }

    
}

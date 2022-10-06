package HW_02.Animals.SubDomesticAnimals;

import HW_02.Animals.DomesticAnimals;
import HW_02.Interfaces.ITrainable;

public class Dog extends DomesticAnimals implements ITrainable {
    private boolean isTrained;

    public Dog(int height, int weight, String eyesColor, String name, String breed, boolean vaccination,
            String furColor, String birthDate, boolean isTrained) {
        super(height, weight, eyesColor, name, breed, vaccination, furColor, birthDate);
        this.isTrained = isTrained;
    }

    public boolean isTrained() {
        return this.isTrained;
    }

    @Override
    public void makeSound() {
        System.out.println("гав-гав-гав...");

    }

    @Override
    public void getTrained() {
        this.isTrained = true;
        System.out.println("Сейчас меня обучает мой хозяин.");
                           
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", обучается= " + this.isTrained + ".";
    }

}
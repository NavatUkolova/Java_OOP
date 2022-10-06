package HW_02.Animals.SubDomesticAnimals;

import HW_02.Animals.DomesticAnimals;

public class Cat extends DomesticAnimals{
    protected boolean hasFur;

    public Cat(int height, int weight, String eyesColor,
    String name, String breed, boolean vaccination,
    String furColor, String birthDate, boolean hasFur) {
        super (height, weight, eyesColor, name, breed, vaccination, furColor, birthDate);
        this.hasFur = hasFur;
    }

    @Override
    public void makeSound() {
        System.out.println("мяу-мяу-мяу...");
        
    }
     @Override
     public String getInfo() {
         return super.getInfo() + ", имеет шерсть = " + this.hasFur + ".";
     }
}
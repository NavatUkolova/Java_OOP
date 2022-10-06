package HW_02.Animals;

import HW_02.Animal;

public abstract class WildAnimals extends Animal{
    protected String habitat;
    protected String dateDiscovery;
 
    public WildAnimals(int height, int weight, String eyesColor, String habitat, String dateDiscovery) {
        super(height, weight, eyesColor);
        this.habitat = habitat;
        this.dateDiscovery = dateDiscovery;
    }


    @Override
    public void makeSound() {

    }

    @Override
    public String getInfo() {
        return super.getInfo() + 
        ", место обитания = " + habitat + ", дата рождения = " + dateDiscovery;
    }
    

}

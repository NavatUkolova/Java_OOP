package HW_02.Animals.SubWildAnimals;

import HW_02.Animals.WildAnimals;

public class Wolf extends WildAnimals {
    protected boolean packLeader;

    public Wolf(int height, int weight, String eyesColor, String habitat, String dateDiscovery, boolean packLeader) {
        super(height, weight, eyesColor, habitat, dateDiscovery);
        this.packLeader = packLeader;
    }

    public boolean getPackLeader() {
        return this.packLeader;
    }

    @Override
    public void makeSound() {
        System.out.println("вууу-вууу...");

    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", лидер стаи = " + this.packLeader + ".";
    }
    
}
package HW_02.Animals.SubWildAnimals;
import HW_02.Animals.WildAnimals;
public class Tiger extends WildAnimals {

    public Tiger(int height, int weight, String eyesColor, String habitat, String dateDiscovery) {
        super(height, weight, eyesColor, habitat, dateDiscovery);
       
    }

    @Override
    public void makeSound() {
        System.out.println("ррррррр!!!");
    }

    @Override
    public String getInfo() {
       
        return super.getInfo();
    }
    
}
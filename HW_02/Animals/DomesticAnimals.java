package HW_02.Animals;

import HW_02.Animal;
import HW_02.Interfaces.IAffectionable;

public abstract class DomesticAnimals extends Animal implements IAffectionable{

    protected String name;
    protected String breed;
    protected boolean vaccination;
    protected String furColor;
    protected String birthDate;

    public DomesticAnimals(int height, int weight, String eyesColor,
            String name, String breed, boolean vaccination,
            String furColor, String birthDate) {
        super(height, weight, eyesColor);
        this.name = name;
        this.breed = breed;
        this.vaccination = vaccination;
        this.furColor = furColor;
        this.birthDate = birthDate;
    }

    @Override
    public void showAffection() {
        System.out.println("Я люблю своего хозяина.");
    }

    @Override
    public String getInfo() {
        return "имя = " + name + ", порода = " + breed + ", дата рождения = " + birthDate + ", " + super.getInfo() + 
        ", цвет шерсти = " + furColor + ", вакцинация = " + vaccination;
    }

}
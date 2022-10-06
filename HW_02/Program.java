package HW_02;

import java.util.ArrayList;

import HW_02.Zoo;
import HW_02.Animals.Birds;
import HW_02.Animals.SubBirds.Hen;
import HW_02.Animals.SubBirds.Stork;
import HW_02.Animals.SubDomesticAnimals.Cat;
import HW_02.Animals.SubDomesticAnimals.Dog;
import HW_02.Animals.SubWildAnimals.Tiger;
import HW_02.Animals.SubWildAnimals.Wolf;
import HW_02.Interfaces.IAffectionable;
import HW_02.Interfaces.ITrainable;

public class Program {
    public static void main(String[] args) {
        Animal hen1 = new Hen(35, 3, "зеленые");

        Animal stork1 = new Stork(66, 7, "голубые", 350);

        Animal tiger1 = new Tiger(110, 75, "желтые", "Сибирь", "20.06.2018");
                
        Animal wolf1 = new Wolf(85, 53, "зеленые","лес", "13.05.2010", true);
                

        Animal cat1 = new Cat(40, 3, "зеленые", "Тефтелька", "персидский",
               true, "рыжий", "15.05.2021", true);

        Animal dog1 = new Dog(66, 9, "черные", "Бобик", "немецкая овчарка",
                false, "коричневый", "12.03.2011", false);

        // for (Animal animalItem : animalList) {
        // System.out.println(" " + animalItem.getClass().getSimpleName() + " info: ");
        // System.out.println(animalItem.getInfo());
        // animalItem.makeSound();
        // if (animalItem instanceof Birds) {
        // ((Birds) animalItem).fly();
        // }
        // if (animalItem instanceof ITrainable) {
        // ((ITrainable) animalItem).getTrained();
        // }
        // if (animalItem instanceof IAffectionable) {
        // ((IAffectionable) animalItem).showAffection();
        // }
        // if (animalItem instanceof Wolf) {
        // ((Wolf) animalItem).getPackLeader();
        // }
        // }

        System.out.println(cat1.getClass());

        Zoo zooList = new Zoo();
        zooList.addAnimal(wolf1);
        zooList.addAnimal(cat1, dog1, stork1, hen1, tiger1);
        zooList.makeAnimalFly(2);
        zooList.makeAnimalTrain(2);
        zooList.makeAnimalShowAffection(2);
        zooList.getAnimalInfo(6);
        zooList.makeAllAnimalsSound();
        zooList.getAllAnimalsInfo();
        zooList.makeAllAnimalFly();
        zooList.makeAllAnimalShowAffection();
        zooList.makeAllAnimalTrain();

       
    }
}

package HW_02;

import java.util.ArrayList;

import HW_02.Animals.Birds;
import HW_02.Interfaces.IAffectionable;
import HW_02.Interfaces.ITrainable;

public class Zoo {
    private ArrayList<Animal> zooList;

    public Zoo() {
        this.zooList = new ArrayList<>();
    }

    String noText = "Нет животных с данным индексом = ";

    public void addAnimal(Animal... args) { // add few Animal
        for (Animal a : args) {
            this.zooList.add(a);
        }
    }

    public void removeAnimal(int index) {
        if (index < this.zooList.size()) {
            this.zooList.remove(index);
        } else {
            System.out.printf(noText + "%d\n", index);
        }
    }

    public void getAnimalInfo(int index) {
        if (index < this.zooList.size()) {
            System.out.printf(" %s'информация:\n", this.zooList.get(index).getClass().getSimpleName());
            System.out.println(this.zooList.get(index).getInfo());
        } else {
            System.out.printf(noText + "%d\n", index);
        }
    }

    public void makeAnimalSound(int index) {
        if (index < this.zooList.size()) {
            System.out.printf(" %s говорит:\n", this.zooList.get(index).getClass().getSimpleName());
            this.zooList.get(index).makeSound();
        } else {
            System.out.printf(noText + "%d\n", index);
        }
    }

    public void makeAnimalFly(int index) {
        if (index < this.zooList.size()) {
            System.out.printf("%s", this.zooList.get(index).getClass().getSimpleName());
            if (this.zooList.get(index) instanceof Birds) {
                System.out.printf(" летает:\n");
                ((Birds) this.zooList.get(index)).fly();
            } else {
                System.out.printf(" не может летать!\n");
            }
        } else {
            System.out.printf(noText + "%d\n", index);
        }
    }

    public void makeAnimalTrain(int index) {
        if (index < this.zooList.size()) {
            System.out.printf("%s", this.zooList.get(index).getClass().getSimpleName());
            if (this.zooList.get(index) instanceof ITrainable) {
                System.out.printf(" можно обучать:\n");
                ((ITrainable) this.zooList.get(index)).getTrained();
            } else {
                System.out.printf(" нельзя обучать!\n");
            }
        } else {
            System.out.printf(noText + "%d\n", index);
        }
    }

    public void makeAnimalShowAffection(int index) {
        if (index < this.zooList.size()) {
            System.out.printf("%s", this.zooList.get(index).getClass().getSimpleName());
            if (this.zooList.get(index) instanceof IAffectionable) {
                System.out.printf(" показывает свою привязанность:\n");
                ((IAffectionable) this.zooList.get(index)).showAffection();
            } else {
                System.out.printf(" не может показать привязанность!\n");
            }
        } else {
            System.out.printf(noText + "%d\n", index);
        }
    }

    public void getAllAnimalsInfo() {
        System.out.println("   Информация о зоопарке:");
        for (int i = 0; i < this.zooList.size(); i++) {
            getAnimalInfo(i);
        }
    }

    public void makeAllAnimalsSound() {
        System.out.println("   Звуки зоопарка:");
        for (Animal item : this.zooList) {
            item.makeSound();
        }
    }

    public void makeAllAnimalFly() {
        System.out.println("  Зоопарк способностей:");
        for (int i = 0; i < this.zooList.size(); i++)  {
            makeAnimalFly(i);
        }
    }

    public void makeAllAnimalTrain() {
        System.out.println("   Зоопарк обучения:");
        for (int i = 0; i < this.zooList.size(); i++)  {
            makeAnimalTrain(i);
        }
    }

    public void makeAllAnimalShowAffection() {
        System.out.println("  Зоопарк проявлений:");
        for (int i = 0; i < this.zooList.size(); i++)  {
            makeAnimalShowAffection(i);
        }
    }

}

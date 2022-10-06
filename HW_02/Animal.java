package HW_02;

import HW_02.Interfaces.ISoundableInfo;

public abstract class Animal implements ISoundableInfo {
    protected int height;
    protected int weight;
    protected String eyesColor;

    public Animal(int height, int weight, String eyesColor) {
        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;
    }

    public Animal() {
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    // public abstract String makeSound();

    public String getInfo() {
        return "высота = " + height + " см" +
                ", масса = " + weight + " кг" +
                ", цвет глаз = " + eyesColor;
    }

    @Override
    public String toString() {
        return getInfo();
    }

}

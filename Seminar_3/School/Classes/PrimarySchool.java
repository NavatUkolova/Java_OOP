package Seminar_3.School.Classes;

import Seminar_3.School.Interface.IPlaying;

public class PrimarySchool extends SchoolStudent implements IPlaying {

    @Override
    public void study() {
        System.out.println("Мне нравится учиться!");
    }

    @Override
    public void play() {
        System.out.println("Я играю со своими игрушками!");
    }

 
}

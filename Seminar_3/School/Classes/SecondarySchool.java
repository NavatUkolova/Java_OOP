package Seminar_3.School.Classes;

import Seminar_3.School.Interface.IPlaying;
import Seminar_3.School.Interface.ISkiping;

public class SecondarySchool extends SchoolStudent implements IPlaying, ISkiping{

    @Override
    public void play() {
        System.out.println("Я ненавижу учиться!"); 
    }

    @Override
    public void study() {
        System.out.println("Я играю в Майнкрафт!");
    }

    @Override
    public void skip() {
        System.out.println("Я прогуливаю занятия!");
    }
    
}
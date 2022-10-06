package Seminar_3.School.Classes;

import Seminar_3.School.Interface.ISkiping;
import Seminar_3.School.Interface.ISmoking;

public class SeventhGradeSchool extends SchoolStudent implements ISmoking, ISkiping{

    @Override
    public void study() {
        System.out.println("Я не люблю учиться!");
    }

    @Override
    public void smoke() {
        System.out.println("Я курю!");
    }

    @Override
    public void skip() {
        System.out.println("Я прогуливаю уроки!");
        
    }

    
}

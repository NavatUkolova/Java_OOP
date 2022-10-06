package Seminar_3.School.Classes;

import Seminar_3.School.Interface.ISmoking;

public class HighSchool extends SchoolStudent implements ISmoking{

    @Override
    public void study() {
        System.out.println("Мне нужно учиться!"); 
    }

    @Override
    public void smoke() {
        System.out.println("Я курю!"); 
    }
    
}

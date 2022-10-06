package Seminar_3.School;

import java.util.ArrayList;

import Seminar_3.School.Classes.HighSchool;
import Seminar_3.School.Classes.PrimarySchool;
import Seminar_3.School.Classes.SchoolStudent;
import Seminar_3.School.Classes.SecondarySchool;
import Seminar_3.School.Classes.SeventhGradeSchool;
import Seminar_3.School.Interface.IPlaying;
import Seminar_3.School.Interface.ISkiping;
import Seminar_3.School.Interface.ISmoking;

public class Program {
    public static void main(String[] args) {
        SchoolStudent pupil1 = new PrimarySchool();
        SchoolStudent student5 = new SecondarySchool();
        SchoolStudent student7 = new SeventhGradeSchool();
        SchoolStudent student11 = new HighSchool();

        ArrayList<SchoolStudent> schoollList = new ArrayList<>();
        schoollList.add(pupil1);
        schoollList.add(student5);
        schoollList.add(student7);
        schoollList.add(student11);

        for (SchoolStudent item : schoollList) {
            primarySchoolMethod(item);
        }

         //primarySchoolMethod(pupil1);
         //primarySchoolMethod(student5);
         //primarySchoolMethod(student11);
    }

    public static void primarySchoolMethod(SchoolStudent student) {
        System.out.printf(" Я %s ученик:\n", student.getClass().getSimpleName());
        student.study();
        if (student instanceof IPlaying) {
            IPlaying playing = (IPlaying) student;
            playing.play();
        }
        if (student instanceof ISmoking) {
            ISmoking smoking = (ISmoking) student;
            smoking.smoke();
        }
        if (student instanceof ISkiping) {
            ISkiping skiping =  (ISkiping) student;
            skiping.skip();
        }
    }
}
package markStudentsManager;

import java.util.ArrayList;
import java.util.List;

public class Semester {

    public static void main(String[] args) {

        List<Mark> marks = new ArrayList<Mark>();

        HomeWork homework1 = new HomeWork("math HW", "08/07/2019");
        HomeWork homework2 = new HomeWork("fr HW", "08/07/2019");

        Teacher teacher1 = new Teacher("Jeremy");
        Student student1 = new Student("Mouaz");
        Student student2 = new Student("Gwen");

        Skill lecture = new Skill(1, "lecture bible");
        Skill ecriture = new Skill(2, "ecriture bible");
        Mark mark1 = new Mark("A", lecture, student1, homework1);
        marks.add(mark1);
        Mark mark2 = new Mark("A", ecriture, student1, homework1);
        marks.add(mark2);
        Mark mark3 = new Mark("B", ecriture, student2, homework1);
        marks.add(mark3);
        Mark mark4 = new Mark("C", ecriture, student2, homework2);
        marks.add(mark4);

        for (Mark mark : marks) {
            System.out.println(mark);
        }

    }

}

package markStudentsManager;

import java.util.ArrayList;

public class Teacher extends Human {

    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<HomeWork> homeWorks = new ArrayList<HomeWork>();
    private ArrayList<Mark> marks = new ArrayList<Mark>();

    // private Mark marksLetterBis;

    public Teacher(String nameForName) {
        super(nameForName);

    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<HomeWork> getHomeWorks() {
        return homeWorks;
    }

    public void setHomeWorks(ArrayList<HomeWork> homeWorks) {
        this.homeWorks = homeWorks;
    }

    public ArrayList<Mark> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Mark> marks) {
        this.marks = marks;
    }

    private boolean checkStudent(ArrayList<HomeWork> homeWorks) {
        boolean present = false;

        for (HomeWork homeWork : homeWorks) {
            for (Student student : students) {

                if (student.isPresent() == false) {

                }
            }
        }

        return present;

    }

    public Mark giveEvaluation(Mark marksLetterBis) {

        Mark mark = marksLetterBis;

        marks.add(mark);
        return mark;

    }
}

package markStudentsManager;

import java.util.ArrayList;

public class Student extends Human {

    private boolean isPresent = false;
    private HomeWork homeWork;
    private Skill skill;
    private ArrayList<Mark> marks = new ArrayList<Mark>();

    public HomeWork getHomeWork() {
        return homeWork;
    }

    public void setHomeWork(HomeWork homeWork) {
        this.homeWork = homeWork;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public ArrayList<Mark> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Mark> marks) {
        this.marks = marks;
    }

    public Student(String nameForName) {
        super(nameForName);

    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean isPresent) {
        this.isPresent = isPresent;
    }

}

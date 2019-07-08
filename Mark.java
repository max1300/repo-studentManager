package markStudentsManager;

public class Mark {

    private String marksLetter;
    private Skill skill;
    private HomeWork homeWork;
    private Student student;

    /*public Mark(String marksLetter) {
        this.marksLetter = marksLetter;
    }*/

    public Mark(String marksLetter, Skill skill, Student student, HomeWork homeWork) {
        setMarksLetter(marksLetter);
        this.skill = skill;
        this.student = student;
        this.homeWork = homeWork;
    }

    public String getMarksLetter() {
        return marksLetter;
    }

    public void setMarksLetter(String marksLetter) {
        if (!marksLetter.equals("A")) {
            System.out.println("please input a valide marksLetter as A, B, C or NE");
        }
        this.marksLetter = marksLetter;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public String displayMarksLetter() {
        System.out.println(marksLetter);
        return marksLetter;
    }

    @Override
    public String toString() {
        return student.getNameForName() + " " + homeWork.getNameHw() + " " + getSkill().getContent() + " "
                + getMarksLetter();
    }

}

package markStudentsManager;

import java.util.ArrayList;

public class HomeWork {

    private String nameHw;
    private String date;
    private ArrayList<Skill> skills = new ArrayList<Skill>();

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    public HomeWork(String nameHw, String date) {
        this.nameHw = nameHw;
        this.date = date;
    }

    public String getNameHw() {
        return nameHw;
    }

    public void setNameHw(String nameHw) {
        this.nameHw = nameHw;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}

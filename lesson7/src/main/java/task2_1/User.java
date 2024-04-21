package task2_1;

public class User {
    private String name;
    private Profession profession;
    private int workExperience;
    public User(String name, Profession profession, int workExperience) {
        this.name = name;
        this.profession = profession;
        this.workExperience = workExperience;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setProfession(Profession profession) {
        this.profession = profession;
    }
    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public String getName() {
        return name;
    }
    public Profession getProfession() {
        return profession;
    }
    public int getWorkExperience() {
        return workExperience;
    }

    public int getSalary () {
        return (int) (1000 * workExperience * profession.getRate());
    }
    public int getSalaryWithBonus (int bonus) {
        return getSalary() + bonus;
    }
}

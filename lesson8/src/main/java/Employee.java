public abstract class Employee {
    private String name;
    private String surname;
    private int experience;
    private Position position;
    public Employee(String name, String surname, int experience, Position position) {
        this.name = name;
        this.surname = surname;
        this.experience = experience;
        this.position = position;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public Position getPosition() {
        return position;
    }
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee name: " + name + ", " +
                "surname: " + surname + ", " +
                "experience: " + experience + ", "+
                "position: " + position;
    }
}

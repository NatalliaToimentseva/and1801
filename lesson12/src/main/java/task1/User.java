package task1;
import java.util.List;

public class User implements Comparable<User>{
    private final String name;
    private int workExperience;
    private final List<String> task;

    public User(String name, int workExperience, List<String> task) {
        this.name = name;
        this.workExperience = workExperience;
        this.task = task;
    }
    @Override
    public String toString() {
        return name + ": " + " workExperience=" + workExperience +
                ", task=" + task;
    }
    public String getName() {
        return name;
    }
    public int getWorkExperience() {
        return workExperience;
    }
    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }
    public List<String> getTask() {
        return task;
    }
    public void setTask(String task) {
        this.task.add(task);
    }
    @Override
    public int compareTo(User o) {
        return o.getWorkExperience() - this.workExperience;
    }
}
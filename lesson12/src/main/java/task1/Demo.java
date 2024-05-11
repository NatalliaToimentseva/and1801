package task1;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            users.add( new User(
                    UsersNames.values()[new Random().nextInt(UsersNames.values().length)].name(),
                    i + 1,
                    getTask()
            ));
        }
        System.out.println(users);

        //Найти всех пользователей, у который количество задач больше 2
        for (User user: users) {
            if (user.getTask().size() > 2) {
                System.out.println(user.getName() + " has more than 2 task");
            }
        }

        //Вывести всех пользователей по стажу работы (от большего к меньшему)
        List<User> sortedByWorkExperienceUsers = new ArrayList<>(users);
        Collections.sort(sortedByWorkExperienceUsers);
        System.out.println(sortedByWorkExperienceUsers);

        //Вывести только уникальные имена пользователей
        Set<String> uniqueUsernames = new HashSet<>();
        for (User user: users) {
            uniqueUsernames.add(user.getName());
        }
        System.out.println(uniqueUsernames);
    }
    private static List<String> getTask() {
        int numberOfTasks = new Random().nextInt(0, 4);
        ArrayList<String> tasks = new ArrayList<>();

        for (int j = 0; j < numberOfTasks; j++) {
            tasks.add("Task" + (j + 1));
        }
        return tasks;
    }
}

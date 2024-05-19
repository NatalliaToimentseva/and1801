import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum Classes {
    Programming, Biology, Physics, Drawing, Mathematics, Chemistry;

    public static List<Classes> setAttendedClasses () {
        List<Classes> attendedClasses = new ArrayList<>();

        int numberOfClasses = new Random().nextInt(0, 5);
        for (int i = 0; i <= numberOfClasses; i++) {
            attendedClasses.add(Classes.values()[new Random().nextInt(Classes.values().length)]);
        }
       return attendedClasses;
    }
}
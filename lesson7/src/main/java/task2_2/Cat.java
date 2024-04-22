package task2_2;

public class Cat implements Voice{
    private final String name;

    public Cat (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    @Override
    public void doVoice() {
        System.out.println("The cat meows");
    }
}

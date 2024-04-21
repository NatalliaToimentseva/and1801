package task2_2;

public class Dog implements Voice {
    private final String name;

    public Dog (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    @Override
    public void doVoice() {
        System.out.println("The dog barks");
    }
}

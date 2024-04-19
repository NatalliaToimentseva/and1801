package task2;

public class RAM {
    private final String name;
    private final int volume;

    public RAM (){
        name = "Hynix";
        volume = 16;
    }

    public RAM (String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}

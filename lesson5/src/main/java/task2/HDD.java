package task2;

public class HDD {
    private final String name;
    private final int volume;

    private final String type;

    public HDD (){
        name = "Toshiba";
        volume = 500;
        type = "Internal";
    }

    public HDD (String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String getType() {
        return type;
    }
}

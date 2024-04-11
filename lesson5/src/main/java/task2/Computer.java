package task2;

public class Computer {
    private final double price;
    private final String model;
    private final RAM ram;
    private final HDD hdd;

    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
        ram = new RAM();
        hdd = new HDD();
    }

    public Computer(double price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public RAM getRam() {
        return ram;
    }

    public HDD getHdd() {
        return hdd;
    }
}

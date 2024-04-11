package task2;

public class DemoComputer {
    public static void main(String[] args) {
        Computer computer1 = new Computer(2170.00, "Dell");

       System.out.println("Model: " + computer1.getModel() +
               ", price: " + computer1.getPrice() + " $" +
               ", RAM: " + computer1.getRam().getName() + ", volume: " + computer1.getRam().getVolume() + " Gb" +
               ", HDD: " + computer1.getHdd().getName() + ", volume: " + computer1.getHdd().getVolume() + " Gb, type: " + computer1.getHdd().getType());

        Computer computer2 = new Computer(3215.00, "Lenovo",
                new RAM("Good RAM", 8),
                new HDD("Seagate", 250, "External"));

        System.out.println("Model: " + computer2.getModel() +
                ", price: " + computer2.getPrice() + " $" +
                ", RAM: " + computer2.getRam().getName() + ", volume: " + computer2.getRam().getVolume() + " Gb" +
                ", HDD: " + computer2.getHdd().getName() + ", volume: " + computer2.getHdd().getVolume() + " Gb, type: " + computer2.getHdd().getType());
    }
}

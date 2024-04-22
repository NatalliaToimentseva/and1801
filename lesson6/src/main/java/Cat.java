public class Cat implements Cloneable{
    private final String name;
    public Cat(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public Cat clone() throws CloneNotSupportedException{
        return (Cat) super.clone();
    }
    @Override
    public String toString() {
        return name;
    }
}
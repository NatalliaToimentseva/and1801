package task1;
import java.util.List;
import java.util.Objects;
public class Product {
    private String name;
    private int price;
    private Category category;
    private boolean isDelivered;
    private List<Store> availableStore;
    private Manufacturer manufacturer;

    public Product(String name, int price, Category category, boolean isDelivered, List<Store> availableStore, Manufacturer manufacturer) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.isDelivered = isDelivered;
        this.availableStore = availableStore;
        this.manufacturer = manufacturer;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public boolean isDelivered() {
        return isDelivered;
    }
    public void setDelivered(boolean delivered) {
        isDelivered = delivered;
    }
    public List<Store> getAvailableStore() {
        return availableStore;
    }
    public void setAvailableStore(List<Store> availableStore) {
        this.availableStore = availableStore;
    }
    public Manufacturer getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", isDelivered=" + isDelivered +
                ", availableStore=" + availableStore +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && category == product.category && Objects.equals(manufacturer, product.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category, manufacturer);
    }
}

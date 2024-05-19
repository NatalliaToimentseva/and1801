package task1;
import java.util.Objects;

public class Store {
    private int number;
    private String city;
    private String address;
    private String phoneNumber;
    public Store(int number, String address, String city, String phoneNumber) {
        this.number = number;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Store{" +
                "number=" + number +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return number == store.number && Objects.equals(address, store.address) && Objects.equals(city, store.city) && Objects.equals(phoneNumber, store.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, address, city, phoneNumber);
    }
}
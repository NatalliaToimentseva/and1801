package task1;

import java.util.*;
import java.util.stream.Collectors;

public class ProductsService {
    private final List<Product> products;

    public ProductsService(List<Product> products) {
        this.products = products;
    }
    public List<Product> getProducts() {
        return products;
    }

    public Optional<Product> findMostExpensiveProduct () {
        return products.stream()
                .max(Comparator
                        .comparingInt(Product::getPrice));
    }
    public Product findCheapestProduct () {
        Optional<Product> cheapProduct = products.stream()
                .min(Comparator.comparingInt(Product::getPrice));
        return cheapProduct.orElse(null);
    }

    public List<Product> findProductsWithDelivery () {
        return products.stream().filter(Product::isDelivered).toList();
    }
    public double getAverageByCategory(Category category) {
        OptionalDouble average = products.stream()
                .filter(p -> p.getCategory() == category)
                .map(Product::getPrice)
                .mapToInt(p -> p)
                .average();
        return average.orElse(0);
    }
    public List<Product> findProductsByManufacturer(Manufacturer manufacturer) {
        return products.stream().filter(p -> p.getManufacturer() == manufacturer).toList();
    }
    public Set<String> findManufacturerByCountry (String country) {
        return products.stream()
                .map(Product::getManufacturer)
                .filter(m -> Objects.equals(m.getCountry(), country))
                .map(Manufacturer::getName)
                .collect(Collectors.toSet());
    }
    public Set<Store> findStoreByCity (String city) {
        return products.stream()
                .flatMap(p -> p.getAvailableStore().stream())
                .filter(p -> Objects.equals(p.getCity(), city))
                .collect(Collectors.toSet());

    }
    public Set<String> findStoreAddressByPhone(String phone) {
        return products.stream()
                .flatMap(p -> p.getAvailableStore().stream())
                .filter(p -> Objects.equals(p.getPhoneNumber(), phone))
                .map(Store::getAddress)
                .collect(Collectors.toSet());
    }
    public Set<Product> showGoodsByStore (int storeNumber) {
        return products.stream().filter(p -> p.getAvailableStore().stream().anyMatch(s -> s.getNumber() == storeNumber)).collect(Collectors.toSet());
    }
    public Map<Integer, String> getPhonesByStoreNumber () {
        return products.stream()
                .flatMap(p -> p.getAvailableStore().stream())
                .distinct()
                .collect(Collectors.toMap(Store::getNumber, Store::getPhoneNumber));
    }
    public boolean findIfProductsDeliveredByCategory(Category category) {
        return products.stream().filter(p -> p.getCategory() == category).allMatch(Product::isDelivered);
    }
    public long getNumbersOfStore () {
        return products.stream().flatMap(p -> p.getAvailableStore().stream()).distinct().count();
    }
    public List<Product> geProductsSortedByPriceDescendingOrder() {
        return products.stream().sorted((p1, p2) -> p2.getPrice() - p1.getPrice()).collect(Collectors.toList());
    }
}

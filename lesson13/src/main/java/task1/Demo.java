package task1;

import java.util.List;
public class Demo {
    public static void main(String[] args) {
        Store store1 = new Store(1, "Address1", "City1", "Phone1");
        Store store2 = new Store(2, "Address2", "City1", "Phone2");
        Store store3 = new Store(3, "Address3", "City1", "Phone3");
        Store store4 = new Store(4, "Address4", "City2", "Phone4");

        Manufacturer m1 = new Manufacturer("Adesso","Russia");
        Manufacturer m2 = new Manufacturer("Baker","Germany");
        Manufacturer m3 = new Manufacturer("PaulRobert","France");
        Manufacturer m4 = new Manufacturer("Modus","Poland");

        List<Product> products = List.of(
                new Product("Product1", 230, Category.Grocery, true, List.of(store1), m1),
                new Product("Product2", 567, Category.ChildrensGoods, true, List.of(store1,store2), m1),
                new Product("Product3", 600, Category.Perfumery, true, List.of(store2,store3), m4),
                new Product("Product4", 712, Category.DairyProducts, true, List.of(store1), m1),
                new Product("Product5", 911, Category.Knitwear, false, List.of(store3,store4), m3),
                new Product("Product6", 1200, Category.Stationery, false, List.of(store4), m2),
                new Product("Product7", 300, Category.Grocery, true, List.of(store4), m1)
        );

        ProductsService ps = new ProductsService(products);

        //1) определить самый дорогой товар
        System.out.println(ps.findMostExpensiveProduct());

        //1) определить самый дешевый товар
        System.out.println(ps.findCheapestProduct());

        //2) найти все товары которые возможно доставить до покупателя
        System.out.println(ps.findProductsWithDelivery());

        //3) посчитать среднюю стоимость товара указанной категории
        System.out.println(ps.getAverageByCategory(Category.Grocery));

        //4) найти все товары определенного производителя
        System.out.println(ps.findProductsByManufacturer(m1));

        //5) найти всех названия производителей указанной страны
        System.out.println(ps.findManufacturerByCountry("Poland"));

        //6) найти все магазины конкретного города
        System.out.println(ps.findStoreByCity("City1"));

        //7) найти адрес магазина по указанному номеру телефона
        System.out.println(ps.findStoreAddressByPhone("Phone1"));

        //8) все товары указанного номера магазина
        System.out.println(ps.showGoodsByStore(1));

        //9) составить map где ключ это номер магазина, а значение - это номер телефона данного магазина
        System.out.println(ps.getPhonesByStoreNumber());

        //10) узнать все ли товары указанной категории можно доставить до покупателя
        System.out.println(ps.findIfProductsDeliveredByCategory(Category.Stationery));

        //11) посчитать количество магазинов
        System.out.println(ps.getNumbersOfStore());

        //12) вывести товары отсортированные по стоимости (от большего к меньшему)
        System.out.println(ps.geProductsSortedByPriceDescendingOrder());
    }
}
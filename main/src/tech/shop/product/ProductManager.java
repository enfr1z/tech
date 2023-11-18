package tech.shop.product;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

public class ProductManager {
    private final Map<String, Product> cart = new HashMap<>();
    private final String ADD = "Добавить";
    private final String SEARCH = "Поиск";
    private final String DELETE = "Удалить";
    private final String CART = "Корзина";

    public void manage(String s) {
        if (s.equalsIgnoreCase(ADD)) {
            add();
        } else if (s.equalsIgnoreCase(SEARCH)) {
            search();
        } else if (s.equalsIgnoreCase(DELETE)) {
            delete();
        } else if (s.equalsIgnoreCase(CART)) {
            cart();
        } else {
            System.out.println("Непонятная команда");
        }
    }

    private void cart() {
        for(Map.Entry<String, Product> entry : cart.entrySet()) {
            System.out.println(entry.getValue().getName());
        }
    }
    private void add() {
        System.out.println("Введите название товара: ");
        Scanner scanner = new Scanner(System.in);
        String productName = scanner.nextLine();
        cart.put(productName, new Product(productName));
        System.out.println("Товар успешно добавлен");
    }

    private void search() {
        System.out.println("Введите название для поиска: ");
        Scanner scanner = new Scanner(System.in);
        String productName = scanner.nextLine();
        Product product = cart.get(productName);

        if (product != null){
            System.out.println("Продукт: " + product.getName());
        } else {
            System.out.printf("Продукт {%s} не найден!%n", productName);
        }
    }

    private void delete() {
        System.out.println("Введите название для удаления: ");
        Scanner scanner = new Scanner(System.in);
        String productName = scanner.nextLine();
        cart.remove(productName);
    }
}

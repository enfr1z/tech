package tech.shop;

import tech.shop.product.ProductManager;

import java.util.Scanner;

public class Main {
    private static final ProductManager productManager = new ProductManager();

    public static void main(String[] args) {
        while(true){
            System.out.println("Что хотите сделать?");
            System.out.println("--- Корзина");
            System.out.println("--- Добавить");
            System.out.println("--- Поиск");
            System.out.println("--- Удалить");

            Scanner sc = new Scanner(System.in);
            productManager.manage(sc.nextLine());

        }
    }
}

package day_10.subject2;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[3];
        for (int i = 0; i < products.length; i++) {
            System.out.println("请输入第" + i + "个商品的名字");
            String name = sc.next();
            System.out.println("请输入第" + i + "个商品的价格");
            int price = sc.nextInt();
            System.out.println("请输入第" + i + "个商品的库存");
            int number = sc.nextInt();
            products[i] = new Product(i, name, price, number);
        }
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

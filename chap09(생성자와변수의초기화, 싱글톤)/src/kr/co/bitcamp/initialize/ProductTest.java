package kr.co.bitcamp.initialize;

import java.util.Arrays;

public class ProductTest {

    public static void main(String[] args) {
        
        Product product = new Product();
        System.out.println("Product.number : " + Product.number + 
                ", countNo : " + product.countNo);
        
        Product product2 = new Product();
        System.out.println("Product.number : " + Product.number + 
                ", countNo : " + product2.countNo);
        
        Product product3 = new Product();
        System.out.println("Product.number : " + Product.number + 
                ", countNo : " + product3.countNo);
        
        System.out.println(Arrays.toString(product.arr));
        System.out.println(Arrays.toString(product2.arr));
        System.out.println(Arrays.toString(product3.arr));

    }

}

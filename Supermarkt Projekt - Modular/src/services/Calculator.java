package services;

import models.Product;

public class Calculator {
    public void calcTotalProductSum(Product[] productsArr) {
        int totalSum = 0;
        for (Product product : productsArr) {
            totalSum += product.getPrice();
        }
        System.out.println(totalSum);
    }
}

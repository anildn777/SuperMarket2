import models.ProductList;
import models.Product;
import services.Calculator;

public class Main {
    public static void main(String[] args) {
        ProductList productList = new ProductList();
        Calculator calculator = new Calculator();
        Product[] products = productList.getProductsList();
        calculator.calcTotalProductSum(products);
    }
}
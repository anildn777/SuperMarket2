package models;

public class ProductList {
    private Product[] productsList;

    public ProductList() {
        this.productsList = new Product[] {
                new Product("Banana", 200),
                new Product("Apple", 150),
                new Product("Orange", 180)
        };
    }

    public Product[] getProductsList() {
        return productsList;
    }
}

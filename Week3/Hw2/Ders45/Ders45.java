package Hw2.Ders45;

public class Ders45 {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product =new Product();
        product.price = 10;
        product.name = "Mouse";

        productManager.add(product);


    }
}

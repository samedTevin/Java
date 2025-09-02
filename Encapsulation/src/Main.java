
public class Main {
    public static void main(String[] args) {

        Product product = new Product(2,"MSI","Laptop",8000,10,"Gray");

        // Checking for constructor
        System.out.println(product.getName());
        System.out.println(product.getId());
        System.out.println(product.getCode());

        // Setter methods.
        product.setName("Asus");
        product.setId(1);
        product.setDescription("Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        ProductManager productManager = new ProductManager();

        productManager.add(product);

        System.out.println(product.getCode());
    }
}
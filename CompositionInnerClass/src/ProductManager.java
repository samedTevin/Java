public class ProductManager {
    public void add(Product product){

        if(ProductValidator.isValid(product)){
            System.out.println("Product has been added.");
        }
        else{
            System.out.println("Product's infos are invalid");
        }


    }
}

public class ProductValidator {

    static {
        System.out.println("Static constructor worked");
    }
    static {
        System.out.println("Static constructor v2 worked");
    }
    public ProductValidator(){
        System.out.println("The constructor worked.");
    }

    public static boolean isValid(Product product){
        if(product.price > 0 && !product.name.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public static class anotherClass{
        public static void delete() {

        }
    }
}

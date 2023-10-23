



public class Main {
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        Electronics smartphone = new Electronics(1, "Smartphone", 499.99, 100, "5W", "2 years");
        Furniture chair = new Furniture(2, "Chair", 59.99, 50, "Wood", "20x20x40 inches");

        ims.addProduct(smartphone);
        ims.addProduct(chair);


        Product retrievedProduct = ims.getProduct(1);
        System.out.println("Retrieved product: " + retrievedProduct.getName());
    }
}
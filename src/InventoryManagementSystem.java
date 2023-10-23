public class InventoryManagementSystem {
    private Product[] inventory = new Product[100];

    private int productCount = 0;

    public void addProduct(Product product) {
        if (productCount < inventory.length) {
            inventory[productCount] = product;
            productCount++;
        } else {
            System.out.println("Inventory is full. Cannot add more products.");
        }
    }

    public void updateProduct(Product updatedProduct) {
        for (int i = 0; i < productCount; i++) {
            if (inventory[i].getProductId() == updatedProduct.getProductId()) {
                inventory[i] = updatedProduct;
                return;
            }
        }
    }

    public void removeProduct(int productId) {
        for (int i = 0; i < productCount; i++) {
            if (inventory[i].getProductId() == productId) {
                // Move the last product to this position to maintain the array's continuity
                inventory[i] = inventory[productCount - 1];
                inventory[productCount - 1] = null;
                productCount--;
                return;
            }
        }
    }

    public Product getProduct(int productId) {
        for (int i = 0; i < productCount; i++) {
            if (inventory[i].getProductId() == productId) {
                return inventory[i];
            }
        }
        return null;
    }

    public void generateLowStockReport() {

    }

    public void generateSalesTrendsReport() {

    }

}

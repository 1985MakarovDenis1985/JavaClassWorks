

public class Supermarket {
    private Product[] products;
    private int currentSku;

    public Supermarket(int capacity) {
        this.products = new Product[capacity];
    }

    public boolean addProduct(Product product) {
        //FIXME check unique
        if (currentSku < products.length && findProduct(product.getBarCode()) == null) {
            products[currentSku] = product;
            currentSku++;
            return true;
        }
        return false;
    }

    public Product findProduct(long barCode) {
        for (int i = 0; i < currentSku; i++) {
            if (products[i].getBarCode() == barCode) {
                return products[i];
            }
        }
        return null;
    }

    public int getCurrentSku() {
        return currentSku;
    }

    public void setCurrentSku(int currentSku) {
        this.currentSku = currentSku;
    }

    public void printProducts() {
        for (int i = 0; i < currentSku; i++) {
            System.out.println(products[i]);

        }
    }
}


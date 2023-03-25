public abstract class Product{
    private double price;
    private int stockQuantity;
    private int soldQuantity;
    public Product(double price, int stockQuantity){
        this.stockQuantity = stockQuantity;
        this.price = price;
        soldQuantity = 0;
    }
    //get/set methods
    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        this.soldQuantity = soldQuantity;
    }
    public abstract double sellUnits(int amount);
}

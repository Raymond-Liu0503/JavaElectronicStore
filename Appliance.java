public abstract class Appliance extends Product{
    private int wattage;
    private String color;
    private String brand;
    public Appliance( double price, int stockQuantity, int wattage, String color, String brand){
        super(price, stockQuantity);
        this.wattage = wattage;
        this.color = color;
        this.brand = brand;
    }

    public int getWattage() {
        return wattage;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }
    public abstract String toString();
}

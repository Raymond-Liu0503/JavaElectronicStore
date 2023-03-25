public class Oven extends Appliance{
    private boolean convection;

    public Oven(double price, int stockQuantity, int wattage, String color, String brand, boolean convection){
        super(price, stockQuantity, wattage, color, brand);
        this.convection = convection;
    }

    public double sellUnits(int amount){
        if (getStockQuantity() >= amount) {
            setSoldQuantity(getSoldQuantity() + amount);
            setStockQuantity(getStockQuantity() - amount);
            return getPrice() * amount;
        }else{
            return 0;
        }
    }

    public String toString(){
        if (convection == true)
            return getBrand() + " Oven with convection " + "(" + getColor() + ", " + getWattage() + " watts) ("+getPrice()+" dollars each, " + getStockQuantity() + " in stock, "+ getSoldQuantity() + " sold)";
        else
            return getBrand() + " Oven " + "(" + getColor() + ", " + getWattage() + " watts) ("+getPrice()+" dollars each, " + getStockQuantity() + " in stock, "+ getSoldQuantity() + " sold)";
    }
}

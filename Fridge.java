//Raymond Liu
//101264487
public class Fridge extends Appliance{
    private boolean hasFreezer;

    public Fridge(double price, int stockQuantity, int wattage, String color, String brand, boolean hasFreezer){
        super(price, stockQuantity, wattage, color, brand);
        this.hasFreezer = hasFreezer;
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
        if (hasFreezer == true)
            return getBrand() + " Fridge with Freezer " + "(" + getColor() + ", " + getWattage() + " watts) ("+getPrice()+" dollars each, " + getStockQuantity() + " in stock, "+ getSoldQuantity() + " sold)";
        else
            return getBrand() + " Fridge " + "(" + getColor() + ", " + getWattage() + " watts) ("+getPrice()+" dollars each, " + getStockQuantity() + " in stock, "+ getSoldQuantity() + " sold)";
    }
}

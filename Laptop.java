//Raymond Liu
//101264487
public class Laptop extends Computer{
    private double screenSize;

    public Laptop( double price, int stockQuantity, double cpu, int ram, boolean ssd, int storage, double screenSize){
        super(price, stockQuantity, cpu,ram,ssd,storage);
        this.screenSize = screenSize;
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
        if (getSsd() == true)
            return screenSize + " inch Laptop PC with " + getCpuSpeed() + "ghz CPU, " + getRAM() + "GB RAM, " + getS_capacity() + "GB SSD drive.("+getPrice()+" dollars each, " + getStockQuantity() + " in stock, "+ getSoldQuantity() + " sold)";
        else
            return screenSize + "inch Laptop PC with " + getCpuSpeed() + "ghz CPU, " + getRAM() + "GB RAM, " + getS_capacity() + "GB HDD drive. ("+getPrice()+" dollars each, " + getStockQuantity() + " in stock, "+ getSoldQuantity() + " sold)";
    }
}

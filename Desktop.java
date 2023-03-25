//Raymond Liu
//101264487
public class Desktop extends Computer{
    private String profile;

    public Desktop( double price, int stockQuantity, double cpu, int ram, boolean ssd, int storage, String profile){
        super(price, stockQuantity, cpu,ram,ssd,storage);
        this.profile = profile;
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
            return profile + " Desktop PC with " + getCpuSpeed() + "ghz CPU, " + getRAM() + "GB RAM, " + getS_capacity() + "GB SSD drive.("+getPrice()+" dollars each, " + getStockQuantity() + " in stock, "+ getSoldQuantity() + " sold)";
        else
            return profile + " Desktop PC with " + getCpuSpeed() + "ghz CPU, " + getRAM() + "GB RAM, " + getS_capacity() + "GB HDD drive. ("+getPrice()+" dollars each, " + getStockQuantity() + " in stock, "+ getSoldQuantity() + " sold)";
    }
}
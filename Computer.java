public abstract class Computer extends Product{
    private Double cpuSpeed;
    private Integer RAM;
    private Integer storage;
    private boolean ssd;
    public Computer(double price, int stockQuantity, double cpuSpeed , int ram, boolean ssd, int storage){
        super(price, stockQuantity);
        this.cpuSpeed = cpuSpeed;
        RAM = ram;
        this.storage = storage;
        this.ssd = ssd;
    }

    public Double getCpuSpeed() {
        return cpuSpeed;
    }

    public Integer getRAM() {
        return RAM;
    }

    public Integer getS_capacity() {
        return storage;
    }
    public boolean getSsd(){
        return ssd;
    }
    public abstract String toString();
}

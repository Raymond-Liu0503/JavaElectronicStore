import java.util.Scanner;
//Raymond Liu
//101264487
public class ElectronicStore {
    private String name;
    final int MAX_PRODUCTS = 10;
    private double revenue;
    private int objCount;
    Product[] productObj;
    public ElectronicStore(String name){
        productObj = new Product[MAX_PRODUCTS];
        this.name = name;
        objCount = 0;

    }

    public boolean addProduct(Product p){
        if (objCount < MAX_PRODUCTS) {
            productObj[objCount++] = p;
            return true;
        }else{
            return false;
        }
    }
    public boolean sellProducts(){
        System.out.println("Inventory:");
        System.out.println(productObj);
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter product (Index):");
        int prodInd = myObj.nextInt();  // Read product index
        System.out.println("Enter product (Index):");
        int prodAmount = myObj.nextInt();  //read product amount

        if (prodInd > objCount-1 || prodInd < 0 || prodAmount < 0){
            return false;
        }else{
            revenue = revenue + productObj[prodInd].sellUnits(prodAmount);
            return true;
        }
    }

    public boolean sellProducts(int index, int amount){
        if (index > objCount-1 || index < 0 || amount < 0){
            return false;
        }else{
            revenue = revenue + productObj[index].sellUnits(amount);
            return true;
        }
    }

    public void printStock(){
        //prints out store stock
        for (int i=0; i<objCount; i++)
            System.out.println(i + ". " + productObj[i]);
    }
    public double getRevenue() {
        return revenue;
    }

    public String getName() {
        return name;
    }
}

public class Product {
    private int upcCode;
    private String name;
    private double price;


    public Product(int upcCode, String name, double price){
    this.upcCode = upcCode;
    this.name = name;
    this.price = price;
    }


    public void setupcCode(int upcCode) {
    this.upcCode = upcCode;
    }


    public int getupcCode() {
    return upcCode;
    }

/**
* Represents the Product object info as a string
*/
    @Override
    public String toString() {
    return "UPCCode= " + upcCode +
    ", name='" + name + '\'' +
    ", price= " + price;
    }
}

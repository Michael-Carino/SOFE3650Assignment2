import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductDB {

    Product product = null;

    public Product GetProductInfo(int upcCode){
        try {
            File productDatabase = new File ("/src/ProductDatabase.txt");
            Scanner myReader = new Scanner(productDatabase);

            while (myReader.hasNextLine()){
                String[] product = myReader.nextLine().split(",");

                int UPC = Integer.parseInt(product[0]);
                String name = product[1];
                double price = Double.parseDouble(product[2]);


                if (upcCode == UPC) {
                this.product = new Product(UPC, name, price);
                break;
                }
            }
        } 
        catch (FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return product;
    }
}

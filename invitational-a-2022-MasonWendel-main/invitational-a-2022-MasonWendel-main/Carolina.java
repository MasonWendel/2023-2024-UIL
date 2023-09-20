import java.util.*;
import java.io.*;

public class Carolina {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("invitational-a-2022-MasonWendel-main/invitational-a-2022-MasonWendel-main/carolina.dat"));

        double totalPrice = 0; 
        double totalTax = 0; 

        while(in.hasNext()){
            double price = in.nextDouble();
            double tax = Math.round(price*0.0825*100)/100.0;
            String ln = in.nextLine();

            totalPrice+=price;
            totalTax += tax;

            System.out.printf("$%.2f + $%.2f = $%.2f %s%n", price,tax,price+tax,ln);
        }
        System.out.printf("$%.2f + $%.2f = $%.2f Combined Single Purchase%n", totalPrice,totalPrice*0.0825,totalPrice*1.0825);
        System.out.printf("$%.2f Sum of Individual Purchases%n", totalPrice+totalTax);
    }
}

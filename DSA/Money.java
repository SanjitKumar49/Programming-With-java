import java.util.Currency;
import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter here indian currency:");
         int currency=sc.nextInt();
         float usd=currency*0.012f;
         System.out.println("your amound in USD: "+usd);

    }
    
}

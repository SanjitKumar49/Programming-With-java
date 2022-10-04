import java.util.Scanner;

public class Intrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your principle amound:");
         int princeple=sc.nextInt();
         System.out.println("enter the year");
         int time=sc.nextInt();
         System.out.println("enter the rate");
         int rate=sc.nextInt();
         int simpliIntrest=(princeple*time*rate)/100;
         System.out.println("your simple intrest is: "+simpliIntrest);

    }
}

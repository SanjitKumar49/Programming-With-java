import java.util.Scanner;

public class welcome {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("how many you want to print:");
   int pass=sc.nextInt();
   while(pass<=50){
    System.out.println("Welcome sanjit"+pass+"time");
    pass++;
   }
}    
}

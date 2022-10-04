import java.util.Scanner;

public class large {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your first no:");
         int a=sc.nextInt();
         System.out.print("enter your second no:");
         int b=sc.nextInt();
         if(a>b){
            System.out.println("large number is: " +a);

         }else{
            System.out.println("large no is: "+b);
         }
    }
    
}

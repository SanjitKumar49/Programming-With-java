import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number:");
         int input =sc.nextInt();
         if(input%2==0){
            System.out.println("given number is even");
         }
         else{
            System.out.println("given number is odd");
         }
    }
    
}

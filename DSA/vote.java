import java.util.Scanner;

public class vote{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you Age:");
         int age=sc.nextInt();
         if(age>=18){
            System.out.println("yes you are eligable for voting.!");

         }else{
            System.out.println("Sorry you are not eligble for vote.!");
         }
         System.out.println("Thank you");

    }
}
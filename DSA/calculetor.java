import java.util.Scanner;


public class calculetor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your first no:");
         int first=sc.nextInt();
         System.out.println("enter your second no:");
         int second=sc.nextInt();
         System.out.println("what you want:\n1=+,2=-,3=*,4=/,5=%");
         int c=sc.nextInt();
         switch(c){
            case 1:
            {
                c=first+second;
                System.out.println("Addition of two no:" +c);
                break;
            }
            case 2:
            {
                c=first-second;
                System.out.println("Subtraction of two no:" +c);
                break;

            }
            case 3:
            {
                c=first*second;
                System.out.println("Multiplection of two no:" +c);
                break;

            }
            case 4:
            {
                c=first+second;
                System.out.println("Divistion of two no:" +c);
                break;

            }
            case 5:
            {
                c=first%second;
                System.out.println("modulo of two no:" +c);
                break;

            }
            default :{
                System.out.println("invailt number please try again.!");
                break;

            }


         }
    }
    
}

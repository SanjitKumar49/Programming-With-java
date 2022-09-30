import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("which month you want to knwon \ntype here no:");
        int month=sc.nextInt();
        switch(month){
            case 1:
            {
                System.out.println("JANUARY");
                break;
            }
            case 2:
            {
                System.out.println("FEABRAURY");
                break;
            }
            case 3:
            {
                System.out.println("MARCH");
                break;
            }
            case 4:
            {
                System.out.println("APREL");
                break;
            }
            case 5:
            {
                System.out.println("MAY");
                break;
            }
            case 6:
            {
                System.out.println("JUNE");
                break;
            }
            case 7:
            {
                System.out.println("JULY");
                break;
            }
            case 8:
            {
                System.out.println("AUGUST");
                break;
            }
            case 9:
            {
                System.out.println("SETEMBER");
                break;
            }
            case 10:
            {
                System.out.println("OCTUBER");
                break;
            }
            case 11:
            {
                System.out.println("NOVEMBER");
                break;
            }
            case 12:
            {
                System.out.println("DECEMBER");
                break;
            }
            default:
            {
                System.out.println("ENTER THE VAILAID NO.!");
                break;
            }



        }
    }
    
}

import java.util.Scanner;

public class choice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1=cse,2=civil,3=machenical,4=eee:");

         int dipt = sc.nextInt();
        switch (dipt) {
            case 1:{
                System.out.println("Computer Science and engineering");
                break;
            }
            case 2:
                System.out.println("civi engineering");
                break;
            case 3:
                System.out.println("machenical engineering");
                break;
            case 4:
                System.out.println("electrical and electronice engineering");
                break;
            default:
                System.out.println("Enter the correct data");

        }

    }

}

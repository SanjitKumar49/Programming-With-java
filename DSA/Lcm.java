
import java.util.*;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int lcm;
        if(a>b)
        lcm=a;
        else
        lcm=b;
        while(true)
        {
            if((lcm%a==0) && (lcm%b==0))
                return;
            else
            lcm--;

        }
        System.out.println(lcm);

    }
}

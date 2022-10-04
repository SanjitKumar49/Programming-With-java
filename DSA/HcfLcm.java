import java.util.Scanner;

import javax.lang.model.element.Element;

public class HcfLcm {
    public static void main(String[] args) {
        int num1=12;
        int num2=18;
        int hcm=num1;
        // if(num1<num2)
        //  hcm=num1;
        //  else
        //  hcm=num2;


        while(true){
        if((num1%hcm==0) && (num2%hcm==0))
            break;
           else
           hcm--;

           }   

           System.out.println(hcm);




    
    }
    
    
}

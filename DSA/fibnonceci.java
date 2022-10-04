public class fibnonceci {
    public static void fibb(int n)
    {
        int num1=0,num2=1;
        int count=0;
        while(count<=n){
            System.out.print(num1 +" ");

            int num3=num1+num2;
            num1=num2;
            num2=num3;
            count+=1;
        }
    }
    public static void main(String[] args) {
        fibb(20);
    }
    
}

import java.util.Arrays;

public class D2Array{
    public static void main(String[] args) {
        int arr[][]={
            {6,7,8,9,0},
            {4,3,2,6,8},
            {1,2,3,4,5}
        };
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <5; j++) {
                System.out.print(Arrays.deepHashCode(arr[i][j])   +" ");
                
            }
            System.out.println("");
            
        }
    }

}
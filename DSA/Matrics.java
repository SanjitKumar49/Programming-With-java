public class Matrics {
    public static void main(String[] args) {
        int arr[][]={
           {1,2,3,4},
           {5,6,7,8},
           {9,7,6,5}
        };
        for (int row = 0; row < arr.length; row++) {
         for (int colum = 0; colum < arr[row].length; colum++) {
            System.out.print(arr[row][colum] +" " );
            
         }
         System.out.println(" ");
            
        }
    }
}

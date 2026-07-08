import java.util.*;
public class ArrtoStr{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int i = 0;
        System.out.println("Enter the elements of the array: ");
        for(i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("The elements of the array are: ");
        for(i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(Arrays.toString(arr));
    } 
}
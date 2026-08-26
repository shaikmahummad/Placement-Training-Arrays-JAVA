import java.util.*;
public class largest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the Array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max= arr[0];
        for(int val : arr){
            if(max<val){
                max=val;
            }
        }
        System.out.println("The largest element in the array is: " + max);
    }
}
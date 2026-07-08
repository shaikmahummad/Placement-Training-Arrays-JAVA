import java.util.Scanner;
public class SumofArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i = 0;
        int sum = 0;
        System.out.println("Enter the elements of the array: ");
        for(i=0; i<n; i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("The sum of the array is: "+sum);
    }
}
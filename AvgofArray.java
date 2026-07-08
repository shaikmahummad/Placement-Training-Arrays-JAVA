import java.util.Scanner;
public class AvgofArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        int i = 0;
        System.out.println("Enter the elements of the array: ");
        for(i=0; i<n; i++){
            arr[i]=sc.nextDouble();
        }
        double sum = 0;
        for(i=0; i<n; i++){
            sum+=arr[i];
        }
        double avg = sum/n;
        System.out.println("The average of the array is: "+avg);
    }
}
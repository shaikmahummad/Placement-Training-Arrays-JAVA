import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int dummy = n;
        int sum = 0;
        int count = 0;
        while(dummy>0){
            count++;
            dummy/=10;
        }
        dummy = n;
        while(dummy>0){
            sum = sum + (int)Math.pow(dummy%10, count);
            dummy/=10;
        }
        System.out.println("Sum of digits raised to the power of count: "+sum);
        if(sum==n){
            System.out.println("The number is an Armstrong number.");
        }
        else{
            System.out.println("The number is not an Armstrong number.");
        }
    }
}
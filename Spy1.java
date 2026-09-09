import java.util.Scanner;
public class Spy1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum=0, product=1, s=n;
        while(n>0){
            int digit = n%10;
            sum+=digit;
            product*=digit;
            n/=10;
        }
        if(sum==product){
            System.out.println(s+" is a spy number.");
        }
        else{
            System.out.println(s+" is not a spy number.");
        }
    }
}
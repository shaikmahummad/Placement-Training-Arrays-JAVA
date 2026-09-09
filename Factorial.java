import java.util.*;
public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int temp = 1;
        for(int i = 1; i<=n; i++){
            temp*=i;
        }
        System.out.println("Factorial of "+n+" is "+temp);
    }
}
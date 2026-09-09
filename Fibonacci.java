import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: ");
        System.out.print(first+" "+second+" ");
        for(int i = 3; i<=n; i++){
            int next = first + second;
            first = second;
            second = next;
            System.out.print(next+" ");
        }
    }
}
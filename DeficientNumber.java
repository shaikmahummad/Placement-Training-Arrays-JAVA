import java.util.Scanner;
public class DeficientNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;
        int check = n;
        for(int i=1; i<=n/2; i++){
            if(n%i==0){
            sum+=i;
            }
        }
        if(sum<check){
            System.out.println(check+" is a deficient number");
        }
        else{
            System.out.println(check+" is not a deficient number");
        }
    }
}
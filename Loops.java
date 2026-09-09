
public class Loops{
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a integer: ");
        // int n = sc.nextInt();
        int n = 10;
        //for loop
        for(int i = 0; i <= n; i++){
            System.out.println(i);
        }

        //while loop
        int i = 0;
        while(i<=n){
            System.out.println(i);
            i++;
        }

        //do-while loop
        i = 0;
        do { 
            System.out.println(i);
            i++;
        } while (i<=n);
    }
}
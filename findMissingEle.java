import java.util.Scanner;
public class findMissingEle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int missing=-1;
        for(int i=0; i<n; i++){
            if(arr[i]!=i+1){
                missing = i+1;
                break;
            }
        }
        if(missing<0){
            System.out.println("All elements are in sequnece");
        }
        else{
            System.out.println("Missing element in array is: "+missing);
        }
    }
}
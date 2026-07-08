import java.util.Scanner;
public class Sumofdiagnol{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        System.out.println("Enter the elements of the 2D array: ");
        int[][] arr = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum = 0;
        for(int i=0; i<rows;i++){
            sum+=arr[i][i];
        }
        System.out.println("Sum of the main diagonal of array: " + sum);
    }
}
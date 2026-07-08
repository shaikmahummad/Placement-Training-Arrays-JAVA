import java.util.Scanner;
public class UpperAndLower{
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
        int[][] upper = new int[rows][cols];
        int[][] lower = new int[rows][cols];
        int usum = 0, lsum = 0;
        System.out.println("Upper triangle:");
        for(int i=0; i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i < j){
                    upper[i][j] = arr[i][j];
                    usum+=arr[i][j];
                } else if(i > j){
                    lower[i][j] = arr[i][j];
                    lsum+=arr[i][j];
                }
                System.out.print(upper[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of the upper triangle: " + usum);
        System.out.println("Lower triangle:");
        for(int i=0; i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(lower[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of the lower triangle: " + lsum);
    }
}

import java.util.Scanner;
public class Sumof2D{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        System.out.println("Enter the elements of the 2D array1: ");
        int[][] arr1 = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the 2D array2: ");
        int[][] arr2 = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        int[][] sum = new int[rows][cols];
        System.out.println("Sum od the 2D arrays: ");
        for(int i=0; i<rows;i++){
            for(int j=0;j<cols;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
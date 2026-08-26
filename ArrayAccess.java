import java.util.*;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        try {
            System.out.println("Element: " + arr[index]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! Please enter between 0 and " + (arr.length - 1));
        } 
        finally {
            System.out.println("Array access operation completed.");
        }
    }
}
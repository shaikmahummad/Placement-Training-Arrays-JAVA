public class Swap{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        //using temporary variable
        int temp = a;
        a = b;
        b = temp;

        //using arithmetic operations 1
        a = a + b;
        b = a - b;
        a = a - b;

        //using arithmetic operations 2
        a = a * b;  
        b = a / b;
        a = a / b;

        //using bitwise XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
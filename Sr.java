import java.util.*;

class SquareRoot {
    int findSquare(int sq) {
        if (sq < 2)
            return sq;

        int start = 0;
        int end = sq / 2;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int sqe = mid * mid;

            if (sqe == sq) {
                return mid;
            } else if (sqe < sq) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}

public class Sr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Square: ");
        int square = sc.nextInt();
        SquareRoot s = new SquareRoot();
        System.out.println("Square root of the " + square + " is " + s.findSquare(square));
    }
}
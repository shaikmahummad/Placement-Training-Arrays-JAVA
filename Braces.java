import java.util.*;
public class Braces{
     public static int minCost(String s) {
        int n = s.length();

        // Check if possible
        int open = 0, close = 0;
        for (char c : s.toCharArray()) {
            if (c == '{') open++;
            else close++;
        }
        if (open != close) return -1;

        int cost = 0;
        int imbalance = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '{') {
                if (imbalance > 0) {
                    cost += imbalance;
                    imbalance--;
                }
            } else {
                imbalance++;
            }
        }

        return cost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(minCost(input)); 
    }
}
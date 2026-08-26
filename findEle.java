import java.util.*;
public class findEle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int target = sc.nextInt();
        int pos=-1, left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) pos = mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        if(pos<0){
            System.out.println("Element not found in array");
        }
        else{
            System.out.println(target+" found at "+pos);
        }
    }
}
import java.util.*;
public class Tc{
    public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a string: ");
    //     String str = sc.nextLine();
    //     String res = "";
    //     for(int i=0;i<str.length();i++){
    //         char ch = str.charAt(i);
    //     if(Character.isUpperCase(ch)){
    //         res+=Character.toLowerCase(ch);
    //     }else if(Character.isLowerCase(ch)){
    //         res+=Character.toUpperCase(ch);
    //     }else{
    //         res+=ch;
    //     }
    // }
    // System.out.println("String after toggling case: " + res);

    //using ASCII values
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = sc.nextLine();
    String res = "";
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch>=65 && ch<=90){
            res+=Character.toLowerCase(ch);
        }else if(ch>=97 && ch<=122){
            res+=Character.toUpperCase(ch);
        }else{
            res+=ch;
        }
    }
    System.out.println("String after toggling case: " + res);
}
}
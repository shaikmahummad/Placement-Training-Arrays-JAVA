public class Basic{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        //Arithmetic
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b);
        //Logical
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a==b||a!=b);
        System.out.println(a==b&&a!=b);
        //Relational
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        //Bitwise
        a = 13;
        b = 77;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
        System.out.println(~b);
        //Shift
        System.out.println(a<<2);
        System.out.println(b<<3);
        System.out.println(a>>3);
        System.out.println(b>>2);
        //Assignment
        a+=5;
        System.out.println(a);
        b-=5;
        System.out.println(b);
        //increment and decrement
        a++;
        System.out.println(a);
        b--;
        System.out.println(b);
    }
}
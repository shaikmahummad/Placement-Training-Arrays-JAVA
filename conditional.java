public class conditional{
    public static void main(String[] args){

        // if
        int a = 90;
        if(a>50){
            System.out.println("a is greater than 50");
        }

        // if-else
         a = 10;
         if(a%2==0){
            System.out.println("a is even");
        }
        else{
            System.out.println("a is odd");
        }

        //if-else-if

        a = 10;
        int b = 20;

        if(a>b){
            System.out.println("a is greater than b");
        }
        else if(a<b){
            System.out.println("a is less than b");
        }
        else{
            System.out.println("a is equal to b");
        }

        //nested if
        int age = 17;
        if(age>=18){
            int dl = 0;
            if(dl==1){
                System.out.println("You have a driving license");
            }
            else{
                System.out.println("You do not have a driving license");
            }
        }
        else{
            System.out.println("You are not eligible to drive");
        }

        //ternary operator
        a = 10;
        b = 20;
        String result = (a>b) ? "a is greater than b" : "a is less than or equal to b";
        System.out.println(result);

        //divisable by both 3 and 5
        a = 15;
        String res = (a%3==0 && a%5==0) ? "TRUE" : "FALSE";
        System.out.println(res);    

        //FIZZ BUZZ
        a = 15;
        if(a%3==0 && a%5==0){
            System.out.println("FIZZ BUZZ");
        }
        else if(a%3==0){
            System.out.println("FIZZ");
        }
        else if(a%5==0){
            System.out.println("BUZZ");
        }
        else{
            System.out.println("NULL");
        }

        //odd or even without using %
        a = 10;
        if((a & 1) == 0){
            System.out.println(a + " is even");
        }
        else{
            System.out.println(a + " is odd");
        }   

        //odd or even using arthmetic operator
        a = 11;
        if((a/2)*2 == a){
            System.out.println(a + " is even");
        }
        else{
            System.out.println(a + " is odd");
        }
    }
}
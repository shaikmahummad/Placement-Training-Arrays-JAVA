class Positions{
    int first = -1;
    void FirstP(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                first = i;
                break;
            }
        }
        if(first<0){
            System.out.println("Key not found in given array");
        }
        else{
            System.out.println("First position: "+first);
        }
    }
    int last = -1;
    void LastP(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                last=i;
            }
        }
        if(last>first){
            System.out.println("Last position: "+last);
        }      
    }
}
public class findPosition{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 2, 5}; 
        int key = 2;
        Positions p = new Positions();
        p.FirstP(arr,key);
        p.LastP(arr,key);
    }
}
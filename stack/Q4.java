
import java.util.*;
public class Q4 {
    public static int[] sub(int[] arr){
        Stack<Integer> s1 = new Stack<>();

        for(int i=0;i<arr.length;i++){
            int num = arr[i];
           
            if(s1.isEmpty()){
                s1.push(num);

            }
            int a = s1.peek();
            if(num==a){
                s1.pop();
            }else{
                s1.push(num);
            }

        }
        int n=s1.size();
        int [] arr1 = new int[n];
        for(int i=0;i<=n;i++){
            arr1[n-i]=s1.pop();
        }
        
        return arr1;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int[] arr1 = sub(arr);

        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
           
        }
        
        
    }
    
}

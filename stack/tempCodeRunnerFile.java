
import java.util.*;
public class Q4 {
    public static int[] sub(int[] arr){
        Stack<Integer> s1 = new Stack<>();

        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            int a = s1.peek();
            if(s1.isEmpty()){
                s1.push(num);

            }
            if(num==a){
                s1.pop();
            }else{
                s1.push(num);
            }

        }
        int [] arr1 = new int[s1.size()];
        for(int i=0;i<s1.size();i++){
            arr1[s1.size()-i]=s1.pop();
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

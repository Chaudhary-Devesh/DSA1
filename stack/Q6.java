import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,1,6,3,4};
        Stack<Integer> s1 = new Stack<>();
        int[] result = new int[arr.length];
        result[result.length-1]=-1;

        for(int i=arr.length-1;i>=0;i--){
            while(s1.size()>0 &&s1.peek()<arr[i] ){
                s1.pop();
            }

            if(s1.size()==0) result[i]=-1;
            else result[i]=s1.peek();
            s1.push(arr[i]);
        }

        for(int j=0;j<result.length;j++){
            System.out.println(result[j]);

        }


        
    }
    
}

import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();

        int [] arr = {1,3,2,1,8,6,3,4};

        int [] arr2 = new int[arr.length];
        arr2[arr.length-1]=-1;
        s1.push(arr[arr.length-1]);
        int i=arr.length-2;

        while(i>=0){
            if(arr[i]>s1.peek()||s1.isEmpty()){
                arr2[i]=-1;
                s1.push(arr[i]);
                i++;
            }else{
                s1.pop();
            }

        }
        for(int j=0;j<arr2.length;j++){
            System.out.println(arr2[j]);
        }
        
    }
    
}

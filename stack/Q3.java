import java.util.*;
public class Q3 {
    public static void insertAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        insertAtBottom(s, data);
        s.push(top);

    }
    public static void rev(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        rev(s);
        insertAtBottom(s, top);
    }
     
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        rev(s);

        System.out.println(s);
        
    }
    
}

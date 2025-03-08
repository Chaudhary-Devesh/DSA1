import java.util.*;
public class Q1 {

    public static void insertAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        insertAtBottom(s, data);
        s.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        // Stack<Integer> s1 = new Stack<>();
        // while(!s.isEmpty()){
        //     s1.push(s.peek());
        //     s.pop();
        // }
        // s1.push(0);
        // while(!s1.isEmpty()){
        //     s.push(s1.peek());
        //     s1.pop();
        // }

        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }

        insertAtBottom(s, 0);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }


        
    }
}
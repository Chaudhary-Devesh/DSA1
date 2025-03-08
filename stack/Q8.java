import java.util.*;
public class Q8 {
    public static boolean check(String b1){
        Stack<Character> s1 = new Stack<>();
        for(int i=0;i<b1.length();i++){
            char curr = b1.charAt(i);
            if(curr=='['||curr=='('||curr=='{'){
                if(curr=='('){
                    s1.push(curr);
                }else if(curr=='['){
                    s1.push(curr);
                }else if(curr=='{'){
                    s1.push(curr);
                }
            }
            else{
                if(curr==']'){
                    if(s1.peek()=='['){
                        s1.pop();
                    }else{
                        return false;
                    }
                }else if(curr==')'){
                    if(s1.peek()=='('){
                        s1.pop();
                    }else{
                        return false;
                    }
                }else if(curr=='}'){
                    if(s1.peek()=='{'){
                        s1.pop();
                    }else{
                        return false;
                    }
                }

                 
            }
        }

        return true;
    }
    public static void main(String[] args) {
        

        String b1 = "({[]}())";
        System.out.println(check(b1));

   
    }
    
}

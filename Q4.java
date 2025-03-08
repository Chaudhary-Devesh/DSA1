import java.util.*;


public class Q4 {
    public static boolean checkBalance(String str){
        Stack<Character> s = new Stack<>();
        if(str.length()%2 !=0 || str.charAt(0)==')'){
            return false;
        }
        else{
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if(ch=='('){
                    s.push(str.charAt(i));
                }else{
                    
                    if(! s.isEmpty() &&s.peek()=='(' ){
                        s.pop();

                    }else{
                        return false;
                    }
                }
            }

        }
        return s.isEmpty();
    }
    public static void main(String[] args) {

        String str = "()()()()";
        System.out.println(checkBalance(str));
        
    }
    
}

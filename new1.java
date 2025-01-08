import java.util.*;
public class new1 {
    public static void main(String[] args) {
        String s = "aaabbccd";
        String str = "";
        for(int i=0;i<s.length();i++){
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                i++;
            }
            str = str+s.charAt(i);
        }
        System.out.println(str);
    

    }
    
    
}

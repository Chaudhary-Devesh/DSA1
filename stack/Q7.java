import java.util.*;
public class Q7 {
    public static void stockSpan(int stocks[],int span[]){
        Stack<Integer> s1 = new Stack<>();
        span[0]=1;
        s1.push(0);

        for(int i=1;i<stocks.length;i++){
            int currPrice = stocks[i];
            while (!s1.isEmpty() && currPrice>stocks[s1.peek()]) {
                s1.pop();
                
            }
            if(s1.isEmpty()){
                span[i]=i+1;
            }else{
                int preHigh = s1.peek();
                span[i] = i-preHigh;
            }
            s1.push(i);
        }

    }
    public static void main(String[] args) {
        int stocks[] = {100,80,60,70,60,85,100};
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);
        for(int i=0;i<span.length;i++){
            System.out.println(span[i]);
        }
        
    }
    
}

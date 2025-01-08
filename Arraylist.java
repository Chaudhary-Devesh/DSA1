import java.util.*;
public class Arraylist {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        System.out.println(list);

    }
    public static int water(ArrayList<Integer> list){
        int water=0;
        // for(int i=0;i<list.size();i++){
        //     for(int j=i+1;j<list.size();j++){
        //         int height = Math.min(list.get(i), list.get(j));
        //         int width= j-1;
        //         int curr = height*width;
        //         if(water<curr){
        //             water = curr;
                
        //         }
            
        //     }
        // }

        int lp=0;
        int rp=list.size()-1;
        while (lp<rp) {
            int width=rp-lp;
            int height=Math.min(list.get(lp), list.get(rp));
            int curr = height*width;
            if(curr>water){
                water=curr;
            }
            if(list.get(lp)<list.get(rp)){
                lp++;
            }else{
                rp--;
            }

            
        }


        return water;
    }
    public static void pair_sum(ArrayList<Integer> list, int target){
        // for(int i=0;i<list.size();i++){
        //     for(int j=i+1;j<list.size();j++){
        //         if(list.get(i)+list.get(j)==target){
        //             System.out.println(i+","+j);
        //             return;
        //         }
        //     }
        // }

        int lp=0;
        int rp=list.size()-1;
        while (lp!=rp) {
            if(list.get(lp)+list.get(rp)==target){
                System.out.println(lp+" "+rp);
                return;
            }
            if(list.get(lp)+list.get(rp)>target){
                rp--;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            
        }

    }
    public static boolean pair_sum2(ArrayList<Integer>list,int target){
        int bp=-1;
        int n=list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=1;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;
        while (lp!=rp) {
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            
            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(2,9);
        // System.out.println(list);
        // int element = list.get(2);
        // System.out.println(element);
        // list.remove(3);
        // System.out.println(list);

        // System.out.println(list);
        // list.set(3,4);
        // System.out.println(list);
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));
        // System.out.println(list.size());
        // for(int i=0;i<list.size();i++){
        //     System.out.println(list.get(i)); 
        // }

        // for(int i=0;i<list.size();i++){
        //     System.out.println(list.get(list.size()-i-1)); 
        // }
        // list.add(2);
        // list.add(5);
        // list.add(9);
        // list.add(3);
        // list.add(6);
        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<list.size();i++){
        //     if(max<list.get(i)){
        //         max=list.get(i);
        //     }
        // }
        // System.out.println(max);

        // int idx1=1,idx2=3;
        // swap(list, idx1, idx2);
        // Collections.sort(list);
        // System.out.println(list);
        // Collections.sort(list,Collections.reverseOrder());
        // System.out.println(list);

        // ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>();
        // for(int i=1;i<=5;i++){
        //     list1.add(i*1);
        //     list2.add(i*2);
        //     list3.add(i*3);
        // }
        // list.add(list1);
        // list.add(list2);
        // list.add(list3);
        // for(int i=0;i<list.size();i++){
        //     ArrayList<Integer> curr = new ArrayList<>(list.get(i));
        //     for(int j=0;j<curr.size();j++){
        //         System.out.print(curr.get(j)+" ");
                

        //     }
        //     System.out.println();
        // }
        // System.out.println(list);
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(8);
        // list.add(6);
        // list.add(2);
        // list.add(5);
        // list.add(4);
        // list.add(8);
        // list.add(3);
        // list.add(7);
        // System.out.println(water(list));
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(6);
        // int target = 5;
        // pair_sum(list, target);
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        System.out.println(pair_sum2(list, target));




        



    
    }
    
}

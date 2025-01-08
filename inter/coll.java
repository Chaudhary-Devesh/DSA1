import java.util.*;
public class coll {
    public static void main(String[] args) {
        ArrayList c1 = new ArrayList<>();
        c1.add(10);
        c1.add("A");
        c1.add(60.5);
        System.out.println(c1);
        c1.remove("A");
        System.out.println(c1);
        // WAP to cearte a linklist and store four objects of different datatypes in a linked list then print linked list. after that add new object of string data type at the end of linked list then print lined list
        LinkedList c2 = new LinkedList();
        c2.add(4);
        c2.add("A");
        c2.add("RAM");
        c2.add(12.65);
        System.out.println(c2);
        c2.addLast(3);
        c2.addFirst("BCA");
        System.out.println(c2);

        // WAP to create a linkedlist in this linked list store 4 object of same datatype then print linke list
        LinkedList<Integer> c3 = new LinkedList<>();
        c3.add(3);
        c3.add(5);
        c3.add(7);
        c3.add(9);
        System.out.println(c3);
    }
    
}

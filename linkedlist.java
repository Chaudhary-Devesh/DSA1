public class linkedlist {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;

        }

    }
    public static Node head;
    public static Node tail;
    public void addfirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next=head;

        head=newNode;

    }
    public static void display(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static void displayR(Node head){
        if(head==null){
            return;
        }
        System.out.println(head.data);
        displayR(head.next);
        
    }
    public static int llength(Node head){
        int count =0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        // ll.addfirst(1);
        // ll.addfirst(2);
        // System.out.println(ll.head);
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(8);
        Node e = new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);
        // System.out.println(a.next.next.next.next.next.data);
        // Node temp =a;
        // while(temp!=null){
        //     System.out.println(temp.data);
        //     temp=temp.next;
        // }
        // display(a);
        // displayR(a);
        System.out.println(llength(a));


    }
    
}

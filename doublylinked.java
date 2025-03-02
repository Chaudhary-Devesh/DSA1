public class doublylinked {
    public static class  Node {
        int val;
        Node next;
        Node pre;
        Node(int val){
            this.val=val;
        }
    
        
    } 
    public static void Display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void DisplayRev(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.pre;
        }
    }
    public static void DisplayRand(Node ob){
        Node temp = ob;

        while(temp.pre!=null){
            // System.out.println(temp.val);
            temp = temp.pre;
        }
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    public static Node Addhead(Node head, int val) {
        Node t = new Node(val);
        head.pre=t;
        t.next = head;
        head = t;
        return head;
        
    }
    public static void Addtail(Node head,int val){
        Node t = new Node(val);
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=t;
        t.pre=temp;
        

    }
    public static Node deleteHead(Node head){
        Node temp = head;
        temp.next.pre = null;
        return temp;

    }
    public static void Addatidx(Node head,int idx,int val){
        Node t = new Node(val);
        Node s = head;
        for(int i=0;i<idx;i++){
            s=s.next;
        }
        Node r = s.next;
        s.next =t;
        t.pre=s;
        t.next=r;
        r.pre=t;
        
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(7);
        Node d = new Node(9);
        Node e = new Node(12);
        Node f = new Node(4);
        a.next=b;
        a.pre = null;
        b.next=c;
        b.pre = a;
        c.next=d;
        c.pre =b;
        d.next=e;
        d.pre =c;
        e.next=f;
        e.pre =d;
        f.next=null;
        f.pre =e;
        // Display(a);
        // DisplayRev(e);
        // DisplayRand(c);
        Node newhead = Addhead(a, 7);
        Addtail(a, 999);
        Addatidx(a, 2, 1000);
        // Display(newhead);
        Node del = deleteHead(a);
        Display(del);

        
    }
    
}

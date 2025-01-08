public class implementation {
    static class  Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist1{
        Node head=null;
        Node tail = null;
        int size=0;
        void insetAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
            size++;
        }
        void insertAthead(int val){
            Node temp = new Node(val);
            if(head==null){
                head=tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }
            size++;

        }
        void insertAt(int idx, int val){
            if(idx==size()){
                insetAtEnd(val);
                return;
            }
            else if(idx==0){
                insertAthead(val);
                return;
            }else if(idx<0 || idx>size()){
                System.out.println("Wrong index");
                return;
            }
            Node  t = new Node(val);
            Node temp = head;
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
                
            }
            t.next = temp.next;
            temp.next=t;
            size++;
        }
        int get(int idx){
            if(idx<0 || idx>size){
                System.out.println("wrong index");
                return -1;
            }
            Node temp = head;
            for(int i=0;i<idx;i++){
                temp= temp.next;

            }
            return temp.data;
        }
        void delete(int idx){
            if(idx==0){
                head=head.next;
                size--;
                return;
            }
            Node temp=head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            temp.next = temp.next.next;
            if(idx==size()){
                tail=temp;
            }
            
            size--;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
            System.out.println();

        }
        int size(){
            // Node temp = head;
            // int count=0;
            // while(temp!=null){
            //     count++;
            //     temp=temp.next;
            // }
            // return count;
            return size;

        }
        

    }

    public static void main(String[] args) {
        linkedlist1 ll = new linkedlist1();
        ll.insetAtEnd(4);
        ll.display();
        
        ll.insetAtEnd(5);
        ll.display();
        // ll.display();
        // System.out.println(ll.size());
        ll.insertAthead(3);
        ll.display();
        ll.insertAthead(2);
        ll.display();
        ll.insertAt(3, 10);
        ll.display();
        // System.out.println(ll.get(3));
        ll.delete(3);
        ll.display();
        
    }
    
}

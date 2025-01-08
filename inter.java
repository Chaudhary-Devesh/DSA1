public class inter {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class link{
        Node head = null;
        Node tail = null;
        
        int size;
        void addhead(int val){
            Node temp = new Node(val);
            if(head == null){
                head=tail=temp;
                size++;
            }
            else{
                temp.next = head;
                head = temp;
                size++;
            }
        }
        void addlast(int val){
            if(head==null){
                addhead(val);
                return;
            }else{
                Node temp= new Node(val);
                tail.next=temp;
                tail=temp;
                size++;
            }
        }
        void insertat(int idx,int val){
            
            if(idx==0){
                addhead(val);
                return;
            }
            else if(idx==size()){
                addlast(val);
                return;
            }else if(idx<0 || idx > size()){
                System.out.println("Invalid index!!");
                return;
            }
            Node temp = new Node(val);
            Node n=head;
            for(int i=0;i<idx-1;i++){
                n=n.next;
            }
            temp.next = n.next;
           n.next=temp;
            size++;

        }
        int size(){
            return size;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
        void delete_node(Node node){
            node.data=node.next.data;
            node.next=node.next.next;
        }


    }
    public static void main(String[] args) {
        
        link list = new link();
        list.addhead(2);
        list.addlast(9);
        list.insertat(1, 5);
        list.display();
        // list.delete_node(a);
        
        

        
    }
    
}

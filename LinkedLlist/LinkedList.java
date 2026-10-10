public class LinkedList {
    public static class Node{
        int data;
        Node next; //reference variable

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        // step1: Create new Node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return ;
        }
        

        // step2: New Node's next = head
        newNode.next = head;

        // step3: head = new Node
        head = newNode;
    }
    public void addLast(int data){
        // step1: Create new Node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return ;
        }
        
        // step2: tail.next = newNode
        tail.next = newNode;

        // step3: tail = newNode
        tail = newNode;
    }

    public void insertAtPosition( int index,int data){
        if(index ==0){
            addFirst(data);
            return ;
        }
        // Create new Node
        Node prevNode = head;
        
        
        for(int i=0;i<index-1;i++){
            prevNode = prevNode.next;
        }
        Node newNode = new Node(data);
        size++;
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        // temp.next = newNode;

    }

    // Remove Operation
    public int removeFirst(){
        if(size==0){
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public  void removeLast(){
        if(size==0){
            return ;
        }else if(size==1){
            head = tail = null;
            size =0;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        prev.next = null;
        tail = prev;
        size--;
    }
    

    public void printLL(){  

        if(head == null){   
            System.out.println("LinkedList is Empty");
            return ;
        }                                       
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+ "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int itrSearch(int key){
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr =tail =head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Find and Remove Nth node from end
    public void removeNthFromEnd(int n){
        int sz = 0;
        Node temp = head;
        while(temp!=null){
            sz++;
            temp = temp.next;
        }
        if (n <= 0 || n > sz) {
            System.out.println("Your Given Index is Out of Range ");
            return;
        }

        if(sz == n){
            head = head.next;
            return ;
        }
        Node prev = head;
        for(int i=0;i<sz-n-1;i++){
            prev=prev.next;
        }
        prev.next = prev.next.next;
        return;

    }
    public static void main(String[] args) {
        LinkedList ll =new LinkedList();

        // to add/delete in LinkedList we will use method
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);

        // ll.printLL();
        ll.addFirst(1);
        // ll.printLL();
        ll.addFirst(2);
        // ll.printLL();
        ll.addFirst(3);
        // ll.printLL();
        ll.addLast(4);
        // ll.printLL();
        ll.addLast(5);
        // ll.printLL();
        ll.addLast(6);
        
        

        // ll.addMiddle(7, 2);
        ll.insertAtPosition(3,0 );
        // ll.printLL();
        

        // System.out.println(ll.removeFirst());
        // System.out.println(ll.size);
        ll.removeLast();
        // ll.printLL();
        // System.out.println(ll.size);/


        // System.out.println(ll.itrSearch(5));
        // System.out.println(ll.recSearch(5));
        ll.reverse();
        // ll.printLL();

        ll.insertAtPosition(3, 7);
        ll.insertAtPosition(3, 9);
        ll.printLL();

        ll.removeNthFromEnd(1);
        System.out.println("Remove nth node from end");
        ll.printLL();
    }
}

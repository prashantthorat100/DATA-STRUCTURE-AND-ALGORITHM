public class DoublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // add
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return ;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    // removeFirst
    public int removeFirst(){
        if (head==null) {
            System.out.println("Dll is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;

        return val;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return ;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("Double LinkedList is empty");
            return;
        }
        if(size ==1){
            head = tail = null;
            size--;
            return ;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    // reverse Doubly LinkedList
    public void reverse(){
        Node curr = head;
        Node previ = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = previ;
            curr.prev = next;
            previ = curr;
            curr = next;
        }
        head = previ;
    }
    public void printLL(){
        Node temp = head;
        // System.out.print("null<--");
        while(temp!=null){
            System.out.print(""+temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        // dll.addFirst(3);
        // dll.addFirst(4);
        // dll.addFirst(5);
        // System.out.println(dll.removeFirst());;
        // dll.printLL();
        // System.out.println(dll.size);
        // dll.addLast(7);
        // dll.addLast(8);

        // dll.printLL();
        // dll.removeLast();
        // dll.printLL();

        dll.addLast(1); 
        dll.addLast(2); 
        dll.addLast(3); 
        dll.addLast(4); 
        dll.addLast(5);
        dll.printLL();
        dll.reverse();
        dll.printLL(); 

    }
}

public class PalindromLL {
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


    // Print LinkedList
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


    // Slow-Fast Approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;  //slow is middle
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        // step1 :find mid
        Node midNode = findMid(head);
    
        // step 2:ṛeverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next ;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }


        // step3: Check left half and right half
        Node left = head;
        Node right = prev;
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            else{
                left = left.next;
                right = right.next;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        PalindromLL ll = new PalindromLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        // ll.addLast(6);
        ll.printLL();
        System.out.println(ll.checkPalindrome());
    }
}

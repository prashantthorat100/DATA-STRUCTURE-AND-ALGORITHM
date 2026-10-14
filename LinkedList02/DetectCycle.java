public class DetectCycle{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
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
    public boolean detectCycle(Node slow, Node fast){
        if(fast == null || fast.next==null){
            return false;
        }
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            return true;
        }
        return detectCycle(slow, fast);
    }

    public void removeCycle(Node slow, Node fast){
        int cycle = 0;//no cycle
        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = 1;
                break;
            }
        }
        if(cycle==0){
            return ;
        }
        Node prev = null;
        slow = head;
        while(slow!=fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }
    public static void main(String[] args){
        DetectCycle ll = new DetectCycle();
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = temp;
        System.out.println(ll.detectCycle(head,head));
        ll.removeCycle(head,head);
        System.out.println(ll.detectCycle(head,head));
    }
}
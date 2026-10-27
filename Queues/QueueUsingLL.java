import org.w3c.dom.Node;

public class QueueUsingLL {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class Queue {
        static Node head = null;
        static Node tail = null;
        
        
        public static boolean isEmpty(){
            return head==null && tail ==null;
        }

        // add
        public void add(int data){
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
                return ;
            }
            
            tail.next = newNode;
            tail = tail.next;
        }
        // remove
        public static int remove(){
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int front = head.data;
            // Single element remove
            if(tail == head){
                head = tail = null;
            }else{  
                head = head.next;
            }
            return front;
        }

        // peek
        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(3);
        q.add(5);
        q.add(7);
        // while (!q.isEmpty()) {
        //     System.out.println(q.remove());
        //     // q.remove();
        // }
        System.out.println(q.remove());
        
    }
}

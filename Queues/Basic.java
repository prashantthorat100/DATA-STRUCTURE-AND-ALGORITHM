import java.util.Queue;

public class Basic {
    static class Queue{
        static int arr[];
        static int size;
        static int front;
        static int rear;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;

        }
        public static boolean isEmpty(){
            return rear==-1 && front ==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        
        // add 
        public static void add(int data){
            if (isFull()) {
                System.out.println("Queue is Full");
                return ;
            }

            if (front==-1) {
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;

        }

        // remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = arr[front];
            
            // last element delete
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }

        // peek
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        int nums[] = {50,55,34,23,66};
        Queue q = new Queue(5);
        for(int i=0;i<5;i++){
            q.add(nums[i]);
        }

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

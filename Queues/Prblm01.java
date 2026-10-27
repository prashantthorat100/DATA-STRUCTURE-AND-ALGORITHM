import java.util.*;;
public class Prblm01 {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        // add 
        public void add(int data){
            while(!isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        //remove
        public static void remove(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
            }
            s1.pop();
        } 
        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        
    }
}

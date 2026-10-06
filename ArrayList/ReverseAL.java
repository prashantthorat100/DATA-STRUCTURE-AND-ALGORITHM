import java.util.ArrayList;

public class ReverseAL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); //TC: O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // System.out.println("Print Reverse");
        // Print Reverse
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(list.size()-i-1)+" ");
        } 
        System.out.println();

        // Find Maximum Number in an ArrayList
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            maxi = Math.max(maxi, list.get(i));
        }
        System.out.println("Maximum is :"+ maxi);


        // Swap two Numbers
        System.out.println(list);
        int idx1=1,idx2=3;
        int temp = list.get(idx1);//2
        list.set(idx1, list.get(idx2));//4
        list.set(idx2, temp);
        System.out.println(list);

    }
}

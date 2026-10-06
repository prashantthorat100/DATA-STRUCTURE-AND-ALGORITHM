import java.util.ArrayList;
public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> strList = new ArrayList<>();
        ArrayList<Boolean> boolList = new ArrayList<>();

        list.add(1); //TC: O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(0,9); //--O(n)
        System.out.println(list);

        // Get Operation - O(1)
        System.out.println(list.get(2));;

        // Remove Element - O(n)
        list.remove(2);
        System.out.println(list);

        // Set Element at index --O(n)
        list.set(2,10);
        System.out.println(list);

        // Contains Element -- O(n)
        System.out.println(list.contains(5));

        // size of ArrayList
        System.out.println(list.size());

        System.out.println("-----Use of size() method-----");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }

}

import java.util.LinkedList;

public class MergeSort {

    public static LinkedList<Integer> mergeSort(LinkedList<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;

        LinkedList<Integer> left = new LinkedList<>(list.subList(0, mid));
        LinkedList<Integer> right = new LinkedList<>(list.subList(mid, list.size()));

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    public static LinkedList<Integer> merge(
            LinkedList<Integer> left,
            LinkedList<Integer> right) {

        LinkedList<Integer> result = new LinkedList<>();

        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.getFirst() <= right.getFirst()) {
                result.addLast(left.removeFirst());
            } else {
                result.addLast(right.removeFirst());
            }
        }

        result.addAll(left);
        result.addAll(right);

        return result;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(3);

        list = mergeSort(list);

        System.out.println(list);
    }
}

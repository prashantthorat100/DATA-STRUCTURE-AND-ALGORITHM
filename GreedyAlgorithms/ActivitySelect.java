import java.util.*;
public class ActivitySelect {
    public static void printArray(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        
    }
    public static void eraseOverlapIntervals(int[][] intervals) {
        int n = intervals[0].length;
        ArrayList<Integer> start = new ArrayList<>();
        ArrayList<Integer> end = new ArrayList<>();

        for(int i=0;i<intervals.length;i++){
            start.add(intervals[i][0]);
            end.add(intervals[i][1]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int maxAct = 0;

        // end sort 
        end.sort(null);
        System.out.println("Start");
        printArray(start);
        System.out.println();
        System.out.println("End");
        printArray(end);
        

        // add 1st activity
        ans.add(0);
        maxAct =1;

        for(int i=1;i<end.size();i++){
            if(start.get(i)>=end.get(i-1)){
                maxAct++;
                ans.add(i);
            }
        
        // return end.size()-maxAct;
        }
    }    

    public static void main(String[] args) {
        // System.out.println("Try clicking the Run button.");
        int intervals[][] ={
            {1,2},
            {2,3},
            {3,4},
            {1,3},
        };
        eraseOverlapIntervals(intervals);
    }


    
}
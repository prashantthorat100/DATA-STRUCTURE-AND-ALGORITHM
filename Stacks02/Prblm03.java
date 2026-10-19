import java.util.Stack;
public class Prblm03 {
    public static int largestRectangle(int heights[]){
        int maxArea = 0;
        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];

        // Next smaller right
        Stack<Integer> s = new Stack<>();

        for(int i=heights.length-1;i>=0;i--){
            while (!s.isEmpty() && heights[s.peek()]>=heights[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = heights.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        
        // Next smaller Left
        s = new Stack<>();

        for(int i=0;i<heights.length;i++){
            while (!s.isEmpty() && heights[s.peek()]>=heights[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Current Area
        for(int i=0;i<heights.length;i++){
            maxArea = Math.max(maxArea, (heights[i] * (nsr[i]-nsl[i]-1)) );
        }
        // return maxArea
        return maxArea;
    }

    public static void main(String[] args) {
        int heights[] = {2,1,5,6,2,3};
        System.out.println("Largest rectangle is:"+ largestRectangle(heights));
    }
}

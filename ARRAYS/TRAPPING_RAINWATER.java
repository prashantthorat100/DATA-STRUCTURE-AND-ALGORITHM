public class TRAPPING_RAINWATER {
    public static int trappedRainWater(int height[]){
        //Calculate leftmax boundary - auxillary array
        int leftmax[] = new int[height.length] ;
        leftmax[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i] = Math.max(leftmax[i-1],height[i]);

        }

        //Calculate rightMax boundary - auxillary array
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2; i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        //loop
        //waterLevel = min(Leftmax Boundary, rightMax Boundary)
        int waterLevel[] = new int[height.length];
        for(int i=0;i<height.length;i++){
            waterLevel[i]= Math.min(leftmax[i],rightMax[i]);
        }
        //trapped water = (waterLevel - height[i])* width
        int trapWater =0;
        for(int i=0;i<height.length;i++){
            trapWater = (waterLevel[i]-height[i] ) + trapWater;
        }
        return trapWater;
    }

    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.print("Trapped RainWater are: " + trappedRainWater(height));
    }
}

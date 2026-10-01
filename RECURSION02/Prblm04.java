public class Prblm04 {
    public static void binaryString(int N, int lastPlace, String str){

        //base case
        if(N==0){
            System.out.println(str);
            return;
        }
        
        //kaam
        if(lastPlace==0){
            // sit 0 on chair N
            binaryString(N-1,0,str+"0");
            binaryString(N-1,1,str+"1");
        }else{
            //sit 1 on Chair n
            binaryString(N-1, 0, str+"0");
        }

        
    } 
    public static void main(String[] args) {
        binaryString(3, 0, ""); 
        // String str = "0";
        // System.out.println(str+="10");

    }
}

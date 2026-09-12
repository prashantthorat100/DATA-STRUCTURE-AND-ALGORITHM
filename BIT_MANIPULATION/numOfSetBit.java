public class numOfSetBit {
    public static void main(String[] args) {
        int num = 7;
        int count =0;
        while(num!=0){
            if((num&1)!=0){
                count++;
            }
            num = num>>1;
            
        }
        System.out.print("Number of Set Bits are :"+count);
    }
}

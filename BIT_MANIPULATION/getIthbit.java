
public class getIthbit {
    public static int getBit(int num , int i){
            int bit = 0;
            bit = ((num)&(1<<i))==0?  0:  1;
            return bit;
            
    }
    public static int setBit(int num , int i){
        int bit = ((num)| (1<<i));
        
        return bit;
    }
    public static int clearBit(int num , int i){
        int bit = ((num) & ~(1<<i));
        return bit;
    }
    public static int updateBit(int num, int i, int newBit){
        // if(newBit==0){
        //     return clearBit(num, i);
        // }
        // else{
        //     return setBit(num, i);
        // }

        num = clearBit(num, i);
        int bitMask = newBit<<i;
        return num | bitMask;
    }

    public static int clearIBits(int num, int i){
        int Bitmask = num & (-1 <<i);
        return Bitmask;
    }
    public static void main(String[] args) {
       System.out.println(getBit(5, 2));
       System.out.println(getBit(6, 0));
       System.out.println(getBit(7, 3));
       System.out.println(getBit(10, 3));
       System.out.println(setBit(10, 2 ));
       System.out.println(clearBit(10, 1 ));
       System.out.println(updateBit(6, 0,1  ));
       System.out.println(clearIBits(7, 2));
       System.out.println(25^5);


    }
}

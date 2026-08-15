public class smallestProduct {
    
        
    public static int product(int num){
        if(num==0){
            return num;
        }
        int ld =0, product =1;
        while(num!=0){
            ld = num%10;
            product = product*ld;
            num /=10;
        }
        return product;
    }

    public static int smallestNumber(int n, int t) {
        // int k=n;
        for(int i=n; i>=n; i++){
            if(product(i)%t==0) return i;
            
        }
        return 0;
    }
    
    public static void main(String[] args) {
        System.out.println(smallestNumber(15, 3));
    }

}
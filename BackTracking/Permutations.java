public class Permutations {
    public static void findPermutations(String str, String ans){ //O(n*n!)
        // base case
        if(str.length()==0){
            System.out.print(ans+" ");
            return ;
        }

        // recursive case
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String remainString = str.substring(0, i)+str.substring(i+1);
            findPermutations(remainString, ans+curr);
            
        }
    }

    
    public static void main(String[] args) {
        String str ="abc";
        findPermutations(str, "");
    }
}

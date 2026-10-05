public class Subset {
    // public static void findSubsets(String str, String ans, int i){
    //     // base case
    //     if(i == str.length()){
    //         System.err.print("{"+ans+"}"+" ");
    //         return;
    //     }

    //     // recursive case
    //     // yes choice
    //     findSubsets(str, ans+str.charAt(i), i+1);

    //     //No choice
    //     findSubsets(str, ans, i+1);
    // }
    public static void findSubsets(String str, StringBuilder ans, int i){
        // base case
        if(i == str.length()){
            System.out.print("{"+ans.toString()+"}"+" ");
            return;
        }

        // recursive case
        /// Yes choice
        ans.append(str.charAt(i));
        findSubsets(str, ans, i + 1);

        // Undo the Yes choice
        ans.deleteCharAt(ans.length()-1);

        // No choice
        findSubsets(str, ans, i + 1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str,new StringBuilder(), 0);
    }
}

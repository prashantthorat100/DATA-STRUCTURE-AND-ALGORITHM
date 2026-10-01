public class Prblm02 {
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
        // StringBuilder sb = new StringBuilder("");

        if(idx==str.length()){
            System.out.print(newStr);
            return ;
        }

        // kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            //duplicate
            removeDuplicate(str, idx+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String org = "aaapppnacollegez";
        boolean map[] = new boolean[26];
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        removeDuplicate(org, idx, sb, map);
    }
}

import java.util.*;
import java.util.LinkedList;

public class Prblm03 {
    public static class Pair {
    char ch;
    int index;
    Pair(char ch, int index){
        this.ch = ch;
        this.index = index;
    }
}
    public static int NonRepeatingIndex(String str){
        Queue<Pair> q = new LinkedList<>();
        int freq[] = new int[26];
        int ans = -1;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            q.add(new Pair(ch, i));
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek().ch -'a']> 1){
                q.remove();
            }
            if(q.isEmpty()){
                ans = -1;
            }else{
                ans = q.peek().index;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "aabbcdde";
        System.out.println(NonRepeatingIndex(str));
    }
}

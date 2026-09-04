public class first {
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder("");
        for(char ch='a' ; ch<='z';ch++){
            sb.append(ch);
        }
        // sb.toString();
        for(int i=0;i<sb.length();i++){
            System.out.print(sb.charAt(i));
        }
        // System.out.println(sb);
    }
}

public class ReplaceVowels {
    public static void main(String[] args) {
        String s="Lovely Professional University";
        StringBuilder sb=new StringBuilder(s.toLowerCase());
        int k=0;
        for(int i=0;i<sb.length();i++){
            if(k%2!=0 && (sb.charAt(i)=='a' || sb.charAt(i)=='e' || sb.charAt(i)=='i' || sb.charAt(i)=='o' || sb.charAt(i)=='u')) {
                sb.replace(i, i+1, "*");
                k++;
            }
            if(sb.charAt(i)==' '){
                continue;
            }
            else{
                k++;
            }
        }
        System.out.println(sb);
    }

}

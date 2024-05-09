public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};


        System.out.println(reverseString(s));
    }
    static char[] reverseString(char[] s) {
        char[] r=new char[s.length];
        for(int i=0;i<s.length;i++){
            r[i]=s[s.length-i-1];
        }
        return r;
    }
}
//...
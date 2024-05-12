

/**
 * 
 * Given two strings ransomNote and magazine, return true 
 * if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 */



public class RansomNote {
   
    public static void main(String[] args) {
    String ransomNote = "aa";
    String magazine = "aab";
   System.out.println(canConstruct(ransomNote,magazine));
   }

    static boolean canConstruct(String ransomNote, String magazine) {
        for(int i=0;i<ransomNote.length();i++){
            System.out.println("hii");
            if(!magazine.contains(ransomNote.charAt(i)+"")){
                return false;
            }
            else{
                magazine= magazine.replaceFirst(ransomNote.charAt(i)+"", "");
                System.out.println("hlo->"+magazine);
            }
        }
        return true;
      }

    //   public boolean canConstruct(String ransomNote, String magazine) {

    //     int []a=new int[26];
    //     int []b=new int[26];

    //     Arrays.fill(a,0);
    //     Arrays.fill(b,0);

    //     for(int i=0;i<ransomNote.length();i++)
    //     {
    //         a[ransomNote.charAt(i)-97]++;
    //     }

    //     for(int i=0;i<magazine.length();i++)
    //     {
    //         b[magazine.charAt(i)-97]++;
    //     }

    //     for(int i=0;i<26;i++)
    //     {
    //         if(a[i]>b[i])
    //         return false;
    //     }
    //     return true;
    // }
      
}

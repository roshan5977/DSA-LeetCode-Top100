import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * In English, we have a concept called root, which can be followed by some other word
 *  to form another longer word - let's call this word successor.
 *  For example, when the root "help" is followed by the successor word "ful", we can form a new word "helpful".

Given a dictionary consisting of many roots and a sentence consisting of words separated by spaces, 
replace all the successors in the sentence with the root forming it. 
If a successor can be replaced by more than one root, replace it with the root that has the shortest length.

Return the sentence after the replacement.

 

Example 1:

Input: dictionary = ["cat","bat","rat"], sentence = "the cattle was rattled by the battery"
Output: "the cat was rat by the bat"
Example 2:

Input: dictionary = ["a","b","c"], sentence = "aadsfasf absbs bbab cadsfafs"
Output: "a a b c"
 */
public class ReplaceWords {
    public static void main(String[] args) {
        // List<String> dictionary=List.of("cat","bat","rat");
        List<String> dictionary=List.of("a", "aa", "aaa", "aaaa");

        // String sentence="the cattle was rattled by the battery";
        String sentence="a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa";

        System.out.println(replaceWords(dictionary,sentence));
    }
    static String replaceWords(List<String> dictionary, String sentence) {

        String finalSentence="";
        String[] listOfWords=  sentence.split(" "); 
        for(int i=0;i<listOfWords.length;i++){
            if(finalSentence!="")finalSentence+=" ";

         String temp=listOfWords[i];
         List<String> checkDictionary=new ArrayList<String>();
          for(String words:dictionary){
             if(listOfWords[i].startsWith(words)){
                checkDictionary.add(listOfWords[i]);
                 temp=words;
             }
          }
          if(checkDictionary.size()>1){
            checkDictionary.sort(null);
          }

          finalSentence+=temp;
        }
        return finalSentence;
         
     }
}

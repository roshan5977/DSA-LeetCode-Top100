class Solution {
  String replaceWords(List<String> dictionary, String sentence) {
    List<String> list = sentence.split(" ").toList();
    for(int i =0; i < dictionary.length; i++){
        for(int j =0; j < list.length; j++){
            if(list[j].startsWith(dictionary[i])){
                list.replaceRange(j , j+1, [dictionary[i]]);
            }
        }
    }
    return list.join(" ");
  }
}
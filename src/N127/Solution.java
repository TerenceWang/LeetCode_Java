package N127;

import java.util.*;

/**
 * Created by terence on 7/9/17.
 */
public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashMap<String,Integer> convWordList = new HashMap();
        HashMap<String,Integer> disc = new HashMap();

        for (int i = 0; i < wordList.size(); i++) {
            String tmp = wordList.get(i);
            convWordList.put(tmp,i);
        }
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int count = 1;
        disc.put(beginWord,1);
        while (!q.isEmpty()){
            String curString = q.poll();
            for (int i = 0; i < curString.length(); i++) {
                char[] wordunit = curString.toCharArray();
                for (int j = 0; j < 26; j++) {
                    wordunit[i] = (char)('a'+j);
                    String newString = new String(wordunit);
                    if(convWordList.containsKey(newString)&&!disc.containsKey(newString)){
                        disc.put(newString,disc.get(curString)+1);
                        q.add(newString);
                    }
                    if(newString.equals(endWord)&&convWordList.containsKey(newString)){
                        return disc.get(curString)+1;
                    }
                }
            }
        }
        return 0;
    }
    public static void main(String[] args){
        String a = "hit";
        String b = "cog";
        List<String> c = new ArrayList<>();
        c.add("hot");
        c.add("dot");
        c.add("dog");
        c.add("lot");
        c.add("log");
        c.add("cog");
        int k = new N127.Solution().ladderLength(a,b,c);
        System.out.println(k);
    }
}

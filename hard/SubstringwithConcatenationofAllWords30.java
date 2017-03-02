package hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringwithConcatenationofAllWords30 {
    public List<Integer> findSubstring(String s, String[] words) {
      
        List<Integer> result = new ArrayList<Integer>();
        if (words == null || words.length == 0 || s == null || s.length() == 0) {
            return result;
        } 
        int sLen = s.length();
        int wLen = words.length;
        int wordLen = words[0].length();
        Map<String, Integer> wordMap  = new HashMap<String, Integer>();
        Map<String, Integer> find  = new HashMap<String, Integer>();
        for(int i=0;i< wLen; i++){
        	if(wordMap.containsKey(words[i])){
        		wordMap.put(words[i], wordMap.get(words[i])+1);
        	}else wordMap.put(words[i], 1);
        }
        
        for(int i = 0; i<= sLen-wordLen*wLen;i++){
        	int j;
        	find.clear();
        	for( j =0;j<wLen;j++){
        		int k = i+j*wordLen;
        		String word = s.substring(k, k+wordLen);
        		if(!wordMap.containsKey(word)) break;
        		if(find.containsKey(word)){
        			find.put(word, find.get(word)+1);
        		}else find.put(word, 1);
        		if(find.get(word)>wordMap.get(word)) break;
        	}
        	if(j==wLen) result.add(i);
        }
        return result;
    }
}
/**
 * public class Solution {
    
    public void initHash(HashMap<String, Integer> targetHash, String[] targetWords) {
        for (int i = 0; i < targetWords.length; ++i) {
            if (targetHash.containsKey(targetWords[i])) {
                targetHash.put(targetWords[i], targetHash.get(targetWords[i]) + 1);
            } else {
                targetHash.put(targetWords[i], 1);
            }
        }
    }
    
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<Integer> ();
        if (words == null || words.length == 0 || s == null || s.length() == 0) {
            return result;
        }
        int totalWordCount = words.length, eachLength = words[0].length();
        HashMap<String, Integer> targetHash =  new HashMap<String, Integer> ();
        HashMap<String, Integer> sourceHash =  new HashMap<String, Integer> ();
        initHash(targetHash, words);
        for (int i = 0; i <= s.length() - eachLength * totalWordCount ; ++i) {
            sourceHash.clear();
            int j = 0;
            for (j = 0; j < totalWordCount; ++j) {
                int index = i + j * eachLength;
                String sub = s.substring(index, index + eachLength);
                if (!targetHash.containsKey(sub)) {
                    break;
                } 
                if (sourceHash.containsKey(sub)) {
                    sourceHash.put(sub, sourceHash.get(sub) + 1);
                } else {
                    sourceHash.put(sub, 1);
                }
                if (sourceHash.get(sub) > targetHash.get(sub)) {
                    break;
                }
            }
            if (j == totalWordCount) {
                result.add(i);
            }
        }
        return result;
    }
}
 */



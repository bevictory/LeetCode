package medium;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder127 {
	public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        if(wordList==null||wordList.size()==0) return 0;
		if(beginWord.equals(endWord)) return 0;
		
		Queue<String> queue = new LinkedList<String>();
		queue.offer(beginWord);
		wordList.remove(beginWord);
		
		int depth =1,width=1;
		while (!queue.isEmpty()) {
			char [] str = queue.poll().toCharArray();
			for (int i = 0; i < str.length; i++) {
				for (char j = 'a'; j <= 'z'; j++) {
					char tem = str[i];
					if(str[i]== j){
						continue;
					}
					str[i]= j;
					if(String.valueOf(str).equals(endWord)) return depth+1;
					if(wordList.remove(String.valueOf(str))){
						queue.offer(String.valueOf(str));
						
					}
					str[i]=tem;
							
				}
			}
		
			if(--width==0){
				depth++;
				width = queue.size();
			}
		}
		
		return 0;
    }
}

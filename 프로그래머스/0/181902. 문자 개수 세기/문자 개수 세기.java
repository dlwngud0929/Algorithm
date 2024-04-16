import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {//문자열 배열 인트스타 인트 케스엘

	 public int[] solution(String my_string)  {
    	int[] answer =new int [52];
    	
    	for(int i =0; i < my_string.length(); i++) {
    		char c =my_string.charAt(i);
    		
    		if(c >='A' && c<='Z') {
    			answer [c-'A']++;
    		} else if (c >='a' && c <= 'z') {
    			answer [26 + c -'a']++;
    		}
    	}
		return answer;
    }
    	
}
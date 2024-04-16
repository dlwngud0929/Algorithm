

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {//문자열 배열 인트스타 인트 케스엘

    public String solution(int q ,int r ,String code) {
    	StringBuilder answer = new StringBuilder();
    	
    	for( int i =0; i<code.length(); i++) {
    		if ( i% q == r) {
    			answer.append(code.charAt(i));
    		}
    	}
    	return answer.toString();
    }
}
    
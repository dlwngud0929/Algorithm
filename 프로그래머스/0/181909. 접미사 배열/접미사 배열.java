

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {//문자열 배열 인트스타 인트 케스엘

    public String[] solution(String my_string) {
        int length = my_string.length();
        String[] suffixes = new String[length];

        // 모든 접미사 생성
        for (int i = 0; i < length; i++) {
            suffixes[i] = my_string.substring(i);
        }

        // 접미사 배열을 사전순으로 정렬
        Arrays.sort(suffixes);

        return suffixes;
    }
}
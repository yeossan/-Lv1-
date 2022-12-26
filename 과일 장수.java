import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        
        score = Arrays.stream(score)
            .boxed().sorted(Collections.reverseOrder())
            .mapToInt(Integer::intValue).toArray();
        
        int answer = 0;
        int index = m - 1;
        
        for(int i=0; i<Math.floor(score.length/m); i++) {
            answer+=score[index]*m;
            index+=m;
        }
        return answer;
    }
}
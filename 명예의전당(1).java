import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int num = score.length;
        int[] answer = new int[num];
        ArrayList<Integer> winner = new ArrayList<>(); //발표점수를 list에 저장

        for(int i=0; i < num; i++) {
            int day = winner.size(); //day
            if(day < k) { //day가 명전 수보다 작으면
                winner.add(score[i]); //winner에 주르륵 넣는다
			  Collections.sort(winner); //오름차순 정렬
            }
            else if(day >= k && winner.get(0) < score[i]) { //명전수와 같거나 많아지고, 당일 score가 발표점수보다 크다면
                winner.set(0, score[i]); //명전 첫값에 score넣기
			 Collections.sort(winner); //오름차순 정렬
            }
            
            answer[i] = winner.get(0); //답 배열에 주르륵 넣는다
        }
        return answer;
    }
}
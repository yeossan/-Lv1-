
import java.util.*;

public class Solution {
    public int[] solution(String s) {
        int length = s.length();  //문자열의 길이를 length에 저장	
        int[] answer = new int[length]; //문자열 길이만큼 배열 할당

        Map<String, Integer> mp = new HashMap<>();
        String[] s1 = s.split(""); //한글자씩 잘라서 s1에 저장

        for (int i = 0; i < length; i++) { //문자열 길이만큼 돈다
           
            if (mp.containsKey(s1[i])) { //대상문자가 나왔던 문자라면
                int index = mp.get(s1[i]); //map번호 저장
                answer[i] = i - index; //나왔던 문자의 index를 빼서 저장
                System.out.println("index = " + index);
            } else { //처음 등장한 문자라면
                answer[i] = -1; //-1저장
            }

            mp.put(temp, i); //인덱스 갱신,입력
        }

        return answer;
    }
}


문자열을 0번째부터 그 문자와 index를 저장하는 Map을 활용하여 현재 index와 
해당 문자의 바로 전 index를 Map에서 조회하여 처리
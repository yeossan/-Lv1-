class Solution {
    public int solution(String s) {
        int answer = 0;
        int ccount = 0; //같은 횟수
        int ncount = 0; //다른 횟수
        char firstword = s.charAt(0);
        
        for(int i = 0; i<s.length(); i++) {
            char nfirstword = s.charAt(i);
            
            if(ccount == ncount) {
                answer++;
                firstword = nfirstword;
            }
            
            if(firstword == nfirstword) {
                ccount++;
            }
            else {
                ncount++;
            }
        }
        return answer;
    }
}
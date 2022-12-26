class Solution {
    
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1; i <= number; i++) {
            int len = getNumber(i, limit, power);
            answer += len;
        }
        return answer;
    }
    
    public int getNumber(int n, int limit, int power) {
        int count = 0;
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                if(i == n/i) {
                    count += 1;
                }
                else {
                    count += 2;
                }  
            } 
            if(count > limit) {
                    return power; //limit넘을시 power 강제리턴
                }
        }
        return count;
    }
}
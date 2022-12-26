class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        StringBuffer ffight = new StringBuffer();
        for(int i = 0; i < food.length; i++) {
            for(int j = 0; j < food[i]/2; j++) {
                ffight.append(i);
            }
        }
        String originffight = ffight.toString();
        String reverseffight = ffight.reverse().toString();
        answer = originffight + "0" + reverseffight;
        
        return answer;
    }
}
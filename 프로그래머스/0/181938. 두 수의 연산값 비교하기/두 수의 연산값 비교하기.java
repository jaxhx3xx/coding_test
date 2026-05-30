class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String result = "";
        result += String.valueOf(a) + String.valueOf(b);
        answer = Integer.valueOf(result);
        if(answer > 2*a*b){
            return answer;
        } else return 2*a*b;
    }
}
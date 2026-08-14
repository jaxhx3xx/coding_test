class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        for(int i = 0; i<=n; i++) {
            sum = (i % 2 ==0 ) ? i : 0;
            answer += sum;
        }
        
        return answer;
    }
}
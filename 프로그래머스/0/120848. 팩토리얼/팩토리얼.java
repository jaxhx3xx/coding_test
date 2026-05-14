class Solution {
    public int solution(int n) {
        int answer = 1;
        int max = 0;
        for(int i=1; i<=n; i++){
            answer*=i;
            if(answer==n){
                max = i;
            }
            else if(answer >=n) {
                max = i-1;
                break;
            }
        }
        return max;
    }
}
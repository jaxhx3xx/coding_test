class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        if(num==1) return 0;
        while(true ){
            if(n%2==0) n/=2;
            else n = (n*3)+1;
            answer++;
            if(n==1) break; 

            if(answer>=500) {
                answer= -1;
                break;
            }
        }
        return answer;
    }
}
class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long usePrice =0;
        for(int i=1; i<=count; i++){
            usePrice += price*i;
        }
        if(usePrice>=money) answer = usePrice - money;
        else answer = 0;
        return answer;
    }
}
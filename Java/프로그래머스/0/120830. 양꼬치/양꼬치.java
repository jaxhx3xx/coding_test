class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int total = n * 12000 + k * 2000;
            if(n / 10 >= 1) {
                return(total - 2000*(n / 10));
            }
            else {
                return total;
            }
        
    }
}
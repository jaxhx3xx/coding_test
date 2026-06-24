class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kk = String.valueOf(k);
        for(int u=i; u<= j; u++ ){
            String num = String.valueOf(u);
          
            for(int t= 0; t<num.length(); t++){
                if(num.charAt(t) == kk.charAt(0)){
                    answer+=1;
                }
            }
        }
        return answer;
    }
}
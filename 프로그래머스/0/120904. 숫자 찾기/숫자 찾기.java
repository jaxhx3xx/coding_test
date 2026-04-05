class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String num2 = String.valueOf(num);
        String[] num3 = num2.split("");
        for(int i=0; i<num3.length; i++){
            if(num3[i].equals(String.valueOf(k))){
                answer = i+1;
                return answer;
            } else answer = -1;
        }
        return answer;
    }
}
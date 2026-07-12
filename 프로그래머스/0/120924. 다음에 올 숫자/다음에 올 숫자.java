class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int ball = 0; 
        int x = common[1]-common[0];
        int y = common[2]-common[1];
        if(x==y){
            ball = x;
            answer = common[common.length-1]+ball;
        }
        else {
            ball = common[1]/common[0];
            answer = common[common.length-1]*ball;
        }
        return answer;
    }
}
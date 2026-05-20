class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int add = 0;
        int sqr=0;
        for(int i=0; i<num_list.length; i++){
            mul *= num_list[i];
            add += num_list[i];
        }
        sqr = (int)Math.pow(add,2);
        if(sqr > mul) answer = 1;
        else answer =0; 
        return answer;
    }
}
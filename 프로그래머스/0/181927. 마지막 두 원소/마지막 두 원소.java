class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;//5
        int[] answer = new int[length+1];//6
        if(num_list[length-1]>num_list[length-2]) 
             answer[length] = num_list[length-1]-num_list[length-2];
        else 
            answer[length] = num_list[length-1]*2;

        for(int i=0; i<num_list.length; i++){
            answer[i]= num_list[i];
        }
        return answer;
    }
}
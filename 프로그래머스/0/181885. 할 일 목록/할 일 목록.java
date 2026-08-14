class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int roomCount = 0;
        for(int i=0; i<finished.length; i++){
            if(finished[i]==false) roomCount++;
        }
        String[] answer = new String[roomCount];
        int c = 0;
        for(int i=0; i<finished.length; i++){
            if(finished[i]==false) {
                answer[c]=todo_list[i];
                c++;
            }
        }
        return answer;
    }
}
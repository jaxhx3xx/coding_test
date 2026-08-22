class Solution {
    public String[] solution(String[] names) {
        int room = (names.length+4)/5;
        String[] answer = new String[room];
        int a = 0;
        for(int i=0; i<names.length; i+=5){
            answer[a] = names[i];
            a++;
        }
        return answer;
    }
}
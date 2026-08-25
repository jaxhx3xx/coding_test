class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        int count = 0;
        for(int i=0; i<answer.length; i++){
            if(answer[i]=="") count++;
        }
        String result[] = new String[answer.length-count];
        int j=0;
        for(int i=0; i<answer.length; i++){
            if(!answer[i].equals("")){
                result[j] = answer[i];
                j++;
            }
        }
        return result;
    }
}
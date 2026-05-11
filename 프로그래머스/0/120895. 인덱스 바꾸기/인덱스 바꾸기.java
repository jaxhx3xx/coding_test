class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String array[] = my_string.split("");
        int i = num1;
        int j= num2;
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        for(int k=0; k<array.length; k++){
            answer+=array[k];
        }
        return answer;
    }
}
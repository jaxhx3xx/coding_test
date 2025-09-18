class Solution {
    public String solution(String my_string) {
        StringBuilder my_string1 = new StringBuilder(my_string); 
        String answer = "";
        answer = my_string1.reverse().toString();
        return answer;
    }
}
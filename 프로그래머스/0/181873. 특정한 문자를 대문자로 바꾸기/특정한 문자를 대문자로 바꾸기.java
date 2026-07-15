class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char c = alp.charAt(0);
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)==c){
                answer+= Character.toUpperCase(my_string.charAt(i));
            }
            else answer+= my_string.charAt(i);
        }
        return answer;
    }
}
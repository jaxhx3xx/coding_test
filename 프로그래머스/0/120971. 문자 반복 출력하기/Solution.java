class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char c;
        for(int i=0; i<my_string.length(); i++){
            c= my_string.charAt(i);
            for(int j=0; j<n; j++){
                answer += c + "";
            }
        }
        return answer;
    }
}

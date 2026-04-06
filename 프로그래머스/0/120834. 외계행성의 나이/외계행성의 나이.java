class Solution {
    public String solution(int age) {
        String answer = "";
        String[] alpha = {"a","b","c","d","e","f","g","h","i","j"};
        
        String num = String.valueOf(age);
        for(int i=0; i<num.length(); i++){
            int digit = num.charAt(i) -'0';
            answer += alpha[digit];
        }
        return answer;
    }
}
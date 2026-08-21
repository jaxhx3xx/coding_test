class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String toUpper1 = myString.toUpperCase();
        String toUpper2 = pat.toUpperCase();
        
        if(toUpper1.contains(toUpper2)) answer=1;
        return answer;
    }
}
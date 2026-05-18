class Solution {
    public String[] solution(String my_str, int n) {
        int remain = 0;
        if(my_str.length() % n == 0){
             remain = my_str.length() / n;
        }else remain = (my_str.length() / n)+1;
        
        String[] answer = new String[remain];
        if(my_str.length()<=n){
            answer[0] = my_str;
            return answer;
        }
        answer[0] = my_str.substring(0,n);
        String my_str1 = my_str.substring(n);
        for(int i=1; i<answer.length-1; i++){
            answer[i] = my_str1.substring(0,n);
            my_str1 = my_str1.substring(n);
        }
        answer[remain-1] = my_str1;
        return answer;
    }
}
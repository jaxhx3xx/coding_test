import java.util.*;
class Solution {
    public String solution(String my_string) {
        Set<String> set = new LinkedHashSet<>();
        String answer = "";
        String arr[] = my_string.split("");
        for(int i=0; i<my_string.length(); i++){
            if(set.add(arr[i])){
                answer += arr[i];
            }
        }
        return answer;
    }
}
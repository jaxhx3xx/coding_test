import java.util.*;
class Solution {
    public int[] solution(long n) {
        int length = String.valueOf(n).length();
        int[] answer = new int[length];
        String s= String.valueOf(n);
        String arr[] = s.split("");
        for(int i=0; i<answer.length; i++){
            answer[i] = Integer.parseInt(arr[i]);
        }
        int j=0;
        int[] answer1 = answer.clone();
        for(int i=answer.length-1; i>-1; i--){
            answer1[j] = answer[i];
            j++;
        }
        return answer1;
    }
}
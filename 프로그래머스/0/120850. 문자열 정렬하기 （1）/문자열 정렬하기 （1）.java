import java.util.*;
class Solution {
    public int[] solution(String my_string) {   
        int count = 0;
        String array[]= my_string.split("");
        for(int i=0; i<my_string.length(); i++){
            if(Character.isDigit(my_string.charAt(i))==true){
                count++;
            }
        }
        int[] answer = new int[count];
        int index=0;
        for(int i=0; i<my_string.length(); i++){
            if(Character.isDigit(my_string.charAt(i))==true){
                answer[index]= Integer.parseInt(array[i]);
                index++;
            }
        }
        Arrays.sort(answer);

        return answer;
    }
}
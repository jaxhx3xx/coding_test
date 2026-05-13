import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char a[] = before.toCharArray();
        char b[] = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(b,a) == true)answer = 1;
        else answer = 0;
        
        return answer;
    }
}
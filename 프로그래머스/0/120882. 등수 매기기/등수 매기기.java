import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] answer2 = new int[score.length];
        for(int i=0; i<score.length; i++){
            for(int j=0; j<2; j++){
                answer[i] += score[i][j];
            }
         //   answer[i]/=2;
        }
        
        for(int i=0; i<score.length; i++){
            int rank = 1;
            for(int j=0; j<score.length; j++){
                if(answer[i]<answer[j]) rank++;
            }
            answer2[i] = rank;
        }
        return answer2;
    }
}
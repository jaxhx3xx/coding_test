class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String myString[] = my_string.split("");
        String[][] arr = new String[my_string.length()/m][m];
        int k=0;
        for(int i=0; i<my_string.length()/m; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = myString[k];
                k++;
            }
        }
        for(int i=0; i<my_string.length()/m; i++){
            answer+= arr[i][c-1];
        }
        return answer;
    }
}
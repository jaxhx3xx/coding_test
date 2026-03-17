class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        int index = 0;
        for(int i=0; i<array.length-1; i++){
            if(array[i]>array[i+1]) {
                max = array[i];
                index = i;
            }
        }
        for(int j=0; j<array.length; j++){
            if(max < array[j]){
                max = array[j];
                index = j;
            }
        }
        answer[0] = max;
        answer[1] = index;
        return answer;
    }
}
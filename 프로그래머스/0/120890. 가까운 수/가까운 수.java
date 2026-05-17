class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int max = Math.abs(n - array[0]);
        int index = 0;
        for(int i = 0; i < array.length; i++) {
            int diff = Math.abs(n - array[i]);
            if(diff < max) {
                max = diff;
                index = i;
            }

            else if(diff == max) {
                if(array[i] < array[index]) {
                    index = i;
                }
            }
        }

        answer = array[index];
        return answer;
    }
}
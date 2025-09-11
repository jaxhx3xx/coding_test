class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n / 2 + n % 2];
        int index = 0;

        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) { // 홀수이면
                answer[index] = i; // 순서대로 배열에 넣기
                index++;
            }
        }

        return answer;
    }
}
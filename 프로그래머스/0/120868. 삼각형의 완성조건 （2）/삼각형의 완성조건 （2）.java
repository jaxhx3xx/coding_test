class Solution {
    public int solution(int[] sides) {
        int max = (sides[0] > sides[1]) ? sides[0] : sides[1];
        int min = (sides[0] < sides[1]) ? sides[0] : sides[1];
        int count = 0;
        for(int i=max - min + 1; i<=max + min - 1; i++) {
            count++;
        }
        return count;
    }
}
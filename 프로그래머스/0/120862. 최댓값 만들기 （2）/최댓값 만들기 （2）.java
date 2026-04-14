import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = -100000000; 
        for(int i=0; i<numbers.length -1; i++){ // 일단 여기 조건식이 -1이 돼야하고
            for(int j = i + 1; j<numbers.length; j++){ 
                if (max < numbers[i] * numbers[j]) max = numbers[i] * numbers[j];
            }
        }
        return max;
    }
}
// 1. i가 0~길이-1까지 돌고 j가 i + 1~ 길이까지 도는 코드 생각한것같은데 그럴거면 바깥 for문 조건식이 numbers.length - 1이 되고 안쪽은 그냥 length여야함
// 2. 일단 max변수 하나 만들어서 곱한값이 그거보다 크면 갱신하는 방향으로 짜는게 더 나을듯?
// 3. 그리고 정렬하면 금방풀림
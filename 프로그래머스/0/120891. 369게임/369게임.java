class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = String.valueOf(order);
        String array[] =str.split("");
        for(int i=0; i<array.length; i++){
            if(array[i].contains("3")) answer++;
            else if(array[i].contains("6")) answer++;
            else if(array[i].contains("9")) answer++;
        }
        return answer;
    }
}
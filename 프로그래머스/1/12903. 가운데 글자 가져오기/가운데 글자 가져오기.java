class Solution {
    public String solution(String s) {
        String answer = "";
        String arr[] = s.split("");
        int index = arr.length/2;
        if(arr.length%2==0){
            answer+= arr[index-1];
            answer+= arr[index];
        }else answer+= arr[index];
        return answer;
    }
}
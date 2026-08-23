class Solution {
    public String solution(String myString) {
        String answer = "";
        String myString1 = myString.toLowerCase();
        String arr[] = myString1.split("");
        for(int i=0; i<arr.length; i++){
            if(arr[i].contains("a")) answer+= arr[i].toUpperCase();
            else answer+= arr[i];
        }
        return answer;
    }
}
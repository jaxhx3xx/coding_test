class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] arr = number.split("");
        int[] arr1 = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            arr1[i] = Integer.parseInt(arr[i]);
            answer+=arr1[i];
        }
        answer = answer%9;
        return answer;
    }
}
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] arr = my_string.split("");
        for(int i=0; i<arr.length; i++){
            boolean check = false;
            for(int j=0; j<indices.length; j++){
                if(i==indices[j]){
                    check = true;
                    break;
                }
            }
            if(!check) answer+=my_string.charAt(i);
        }
        return answer;
    }
}
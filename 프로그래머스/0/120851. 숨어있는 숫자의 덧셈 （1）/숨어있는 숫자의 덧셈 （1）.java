class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] array = my_string.split("");
        char c = my_string.charAt(0);
        for(int i=0; i<array.length; i++){
            c = my_string.charAt(i);
            if(Character.isDigit(c)){
                answer+= Integer.parseInt(array[i]);
            }
        }
        return answer;
    }
}
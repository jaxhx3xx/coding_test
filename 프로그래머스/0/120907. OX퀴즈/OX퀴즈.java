class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0; i<answer.length; i++){
            String arr[] = quiz[i].split(" ");
            int num1 = Integer.parseInt(arr[0]);
            int num2 = Integer.parseInt(arr[2]);
            int result = Integer.parseInt(arr[4]);
            int calc = 0;
            if(arr[1].equals("+")){
                calc = num1+num2;
            } else calc = num1-num2;
            if(result==calc) answer[i] = "O";
            else answer[i] = "X";
        }
        return answer;
    }
}
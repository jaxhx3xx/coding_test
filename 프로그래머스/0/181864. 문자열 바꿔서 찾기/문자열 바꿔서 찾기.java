class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String result = "";
        String myStringArr[] = myString.split("");
        for(int i=0; i<myStringArr.length; i++){
            if(myStringArr[i].equals("A")) result+="B";
            else result+="A";
        }
        if(result.contains(pat)) answer = 1;
        else answer = 0;
        return answer;
    }
}
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String ss = s.toLowerCase();
        int pCount =0;
        int yCount =0;
        for(int i=0; i<ss.length(); i++){
            char c = ss.charAt(i);
            if(String.valueOf(c).equals("p")) pCount++;
            else if(String.valueOf(c).equals("y"))yCount++;
        }
        if(pCount==yCount || pCount==0 && yCount==0) answer = true;
        else answer = false;
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(pCount);

        return answer;
    }
}
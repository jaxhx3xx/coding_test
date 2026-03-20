class Solution {
    public int solution(int n) {
        int answer = 1;
        String k=String.valueOf(n);
        String[] v=k.split("");
        for(int i=0;i<v.length;i++){
            answer+= Integer.parseInt(v[i]);
        }
        return answer-1;
    }
}
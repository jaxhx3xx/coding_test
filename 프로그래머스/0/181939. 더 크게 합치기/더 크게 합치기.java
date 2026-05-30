class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String resultab = "";
        String resultba = "";
        int ab =0;
        int ba =0;
        resultab = String.valueOf(a) + String.valueOf(b);
        resultba = String.valueOf(b) + String.valueOf(a);
        ab = Integer.valueOf(resultab);
        ba = Integer.valueOf(resultba);
        if(ab>ba) return ab;
        else return ba;
    }
}
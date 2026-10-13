import java.util.ArrayList;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        int num =0;
        for(int i=0; i<intStrs.length; i++){
            num = Integer.valueOf(intStrs[i].substring(s,s+l));
            if(num > k) list.add(num);
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int count=0;
        String str = "";
        for(int i=0; i<arr.length; i++){
            boolean b = false;
            for(int j=0; j<delete_list.length; j++){
                if(arr[i]==delete_list[j]){
                    count++;
                    b=true;
                    break;
                }
            }
            if(!b)str+= arr[i]+",";
        }
        String strArr[] = str.split(",");
        int answer[] = new int[strArr.length];
        for(int i=0; i<strArr.length; i++){
            answer[i]=Integer.parseInt(strArr[i].trim());
        }

        
        
        
        
        
        
        
        // int[] answer = new int[arr.length - count];
        // int f = 0;
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<delete_list.length; j++){
        //         if(arr[i]!=delete_list[j]){
        //             answer[f]=arr[i];
        //             f++;
        //         }
        //     }
        // }

        return answer;
    }
}
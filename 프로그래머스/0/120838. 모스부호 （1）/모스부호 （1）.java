class Solution {
    public String solution(String letter) {
        String check[] = letter.split(" ");
        String index = "";
        String array[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i=0; i<check.length; i++){
            for(int j =0; j<array.length; j++){
                if(check[i].equals(array[j])){
                index += (char)(j+97); 
                }
            }
        }

        return index;
    }
}
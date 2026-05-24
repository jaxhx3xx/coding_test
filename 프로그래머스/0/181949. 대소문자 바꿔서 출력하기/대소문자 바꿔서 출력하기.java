import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        char ch = a.charAt(0);
        for(int i=0; i<a.length(); i++){
            ch = a.charAt(i);
            if(Character.isUpperCase(ch)){
                result+= String.valueOf(ch).toLowerCase();
            } else result+= String.valueOf(ch).toUpperCase();
        }
        System.out.print(result);
    }
}
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(;;){
            int num = sc.nextInt();
            int num1 = sc.nextInt();
            
            if(num==0 && num1 == 0) break;
            System.out.println(num + num1);
        }
            
    }
}
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            int a = sc.nextInt();
            sum += num * a;
        }
        if(sum==price) System.out.println("Yes");
        else System.out.println("No");
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = b;
	int value = 10000+(a*1000);
        if(a==b && a==c && b==c) {
		System.out.print(value);
		
        }
        else if(a==b || a==c) System.out.print(1000+(a*100));
        else if(b==a || b==c) System.out.print(1000+(b*100));
        else if(c==a || c==b) System.out.print(1000+(c*100));
        
        if(a!=b && a!=c && b!=c){
            if(max < a) max = a;
            if(max < c) max = c;
            System.out.print(max*100);
        }
    }
}
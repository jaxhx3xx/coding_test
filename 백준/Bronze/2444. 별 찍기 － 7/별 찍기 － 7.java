import java.util.Scanner;
public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int m=1; m<=n-i; m++){
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i)-1; j++) {
				System.out.print("*");		
			}
		System.out.println();
		}
		for(int i=1; i<=n-1; i++) {
			for(int m=1; m<=i; m++){
				System.out.print(" ");
			}
			for(int j=1; j<=(2*(n-i)-1); j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
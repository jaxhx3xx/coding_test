import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] n= new int[9];
		for(int i=0; i<9; i++) {
			n[i] = sc.nextInt();
		}
		int max = 0;
		int index = 0;
		for(int i=0; i<9; i++) {
		 	if(max < n[i]){
				max = n[i];
				index = i;
			}
		}
		System.out.println(max);
		System.out.print(index +1);
	}
	
}
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       	int a = sc.nextInt();
        int b[] = new int[a]; // 1 2 3 4 5 
        for(int i=0; i<a; i++){
		b[i] = sc.nextInt();
	}
	int max =b[0] ;
	int least = b[0];
	for(int i=1; i<a; i++) {
		if(max < b[i]){
			max = b[i]; 
            	}
		else if(least > b[i]){
			least = b[i];
			
		}
        }
	System.out.print(least +  " ");
	System.out.print(max);
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[][] = new int[num][2];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i< num; i++) {
            int sum = 0;
            for (int j = 0; j < 2; j++) {
                sum += arr[i][j];
            }
            System.out.println("Case #" + (i+1) + ": " + arr[i][0] + " + " + arr[i][1] + " = " + sum);
        }


    }
}
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        int i;
        for(i = 0; i< a; i++){
            b[i] = sc.nextInt();
        }

        int c = sc.nextInt();
        int count = 0;
        for(i = 0; i<a; i++) {
            if(b[i]==c) {
                count++;
            }
        }
        System.out.println(count);

    }
}

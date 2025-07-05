import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int nam[] = new int[10];
        int count = 0;
        for(int i=0; i<10; i++){
            int num = sc.nextInt();
            nam[i] =num % 42;
        }
        for(int i=0; i<10; i++) {
            boolean isUnique = true;

            for(int j=0; j<i; j++){
                if(nam[i] == nam[j]){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique) count++;
        }
        System.out.println(count);
    }
}
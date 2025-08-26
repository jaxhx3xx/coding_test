import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int room = sc.nextInt();
        int arr[] = new int[room];
        int turn = sc.nextInt();
        for(int i=0; i<turn; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            int input = sc.nextInt();
            for(int j = start-1; j<end; j++){
                arr[j] = input;
            }
        }
        for(int i=0; i<room; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}


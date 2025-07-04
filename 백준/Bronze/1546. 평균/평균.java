import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        double avr = 0;
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]) max = arr[i];
        }
        for(int i = 0; i<arr.length; i++){
            avr += (double) arr[i] / max * 100;
        }
        avr = avr / n;
        System.out.print(avr);
    }
}

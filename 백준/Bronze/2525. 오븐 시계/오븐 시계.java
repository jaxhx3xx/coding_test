import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("몇 시 몇 분:");
        int hours = sc.nextInt();
        int min = sc.nextInt();
        //System.out.print("필요한 시간");
        int num = sc.nextInt();
        min += num;
        hours += min/60;
        min = min % 60;
        hours = hours % 24;
        System.out.print(hours + " " + min);
    }
}

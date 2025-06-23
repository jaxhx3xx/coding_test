import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int min = sc.nextInt();
        if(min < 45) {
            hours--;
            min = 60 -(45-min);
            if(hours < 0) hours=23; 
            System.out.print(hours + " " + min);
        }
        else{
            System.out.println(hours + " " + (min-45));
        }
    }
}
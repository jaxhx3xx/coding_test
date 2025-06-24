import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][];
        int max = 0;

        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            arr[i] = new char[str.length()];

            if (str.length() > max) max = str.length();
            for (int j = 0 ; j < arr[i].length ; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for (int i = 0 ; i < max ; i++)  {
            for (int j = 0 ; j < 5 ; j++) {
                if (i < arr[j].length) System.out.print(arr[j][i]);
            }
        }

    }
}
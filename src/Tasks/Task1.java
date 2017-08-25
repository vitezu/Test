package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите число N: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        for (int i = 2; i < N; i++) {
            boolean a = true;
            int q = (int) Math.sqrt(i);
            for (int j = 2; j <= q; j++) {
                if ((i % j) == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.print(i + " ");
            }
        }
    }
}

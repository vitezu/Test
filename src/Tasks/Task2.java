package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число N: ");
        int n = Integer.parseInt(reader.readLine());
        int a = 1, b = 1;
        int fib = 2;
        while (true) {
            fib = a + b;
            if (fib>=n) break;
            b = a;
            a = fib;
            System.out.print(" " + fib);
        }
    }
}

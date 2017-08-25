package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число a: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Введите число b: ");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("НОД = " + gcd(a, b));
        System.out.println("НОК = " + lcm(a, b));
    }

   private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    private static int lcm(int a, int b) {
        return (a/gcd(a,b))*b;
    }
}
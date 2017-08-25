package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите слово: ");
        String world = reader.readLine();
        if (world.equals(reverseWorld(world))) {
            System.out.println(world + " палиндром");
        } else {
            System.out.println(world + " не палиндром");
        }
    }

    private static String reverseWorld(String world) {
        String s = "";
        for (int i = world.length()-1; i >= 0; i--) {
            s += world.charAt(i);
        }
        return s;
    }
}

package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите текст: ");
        String text = reader.readLine();
        String result = text.replaceAll("\\d", "");
        System.out.println(result);
    }
}

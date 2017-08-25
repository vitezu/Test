package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите координату х первой точки отрезка a: ");
        float ax1 = Float.parseFloat(reader.readLine());
        System.out.print("Введите координату y первой точки отрезка a: ");
        float ay1 = Float.parseFloat(reader.readLine());
        System.out.print("Введите координату х второй точки отрезка a: ");
        float ax2 = Float.parseFloat(reader.readLine());
        System.out.print("Введите координату y второй точки отрезка a: ");
        float ay2 = Float.parseFloat(reader.readLine());

        System.out.print("Введите координату х первой точки отрезка b: ");
        float bx1 = Float.parseFloat(reader.readLine());
        System.out.print("Введите координату y первой точки отрезка b: ");
        float by1 = Float.parseFloat(reader.readLine());
        System.out.print("Введите координату х второй точки отрезка b: ");
        float bx2 = Float.parseFloat(reader.readLine());
        System.out.print("Введите координату y второй точки отрезка b: ");
        float by2 = Float.parseFloat(reader.readLine());

        float v1=(bx2-bx1)*(ay1-by1)-(by2-by1)*(ax1-bx1);
        float v2=(bx2-bx1)*(ay2-by1)-(by2-by1)*(ax2-bx1);
        float v3=(ax2-ax1)*(by1-ay1)-(ay2-ay1)*(bx1-ax1);
        float v4=(ax2-ax1)*(by2-ay1)-(ay2-ay1)*(bx2-ax1);
            if ((v1*v2<=0) && (v3*v4<=0)) {
                System.out.println("Отрезки пересекаются");
            }
                else    {
                    System.out.println("Отрезки не пересекаются");
            }
    }
}


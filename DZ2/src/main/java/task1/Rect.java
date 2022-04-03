package task1;

import java.util.Scanner;

public class Rect extends Figure2D {
    @Override
    double area() {
        Scanner sc = new Scanner(System.in);
        Double S1 = 0.0;
        System.out.println("Введите 1-ю сторону.");
        S1 = sc.nextDouble();
        Double S2 = 0.0;
        System.out.println("Введите 2-ю сторону.");
        S2 = sc.nextDouble();
        Double S3 = 0.0;
        return S1*S2;
    }
}
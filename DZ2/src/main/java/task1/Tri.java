package task1;

import java.util.Scanner;

public class Tri extends Figure2D {
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
        System.out.println("Введите 3-ю сторону.");
        S3 = sc.nextDouble();
        double p = (S1+S2+S3)/2;
        return Math.sqrt(p*(p-S1)*(p-S2)*(p-S3));
    }
}

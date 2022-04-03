package task1;

import java.util.Scanner;

public class Trap extends Figure2D {
    @Override
    double area() {
        Scanner sc = new Scanner(System.in);
        Double S1 = 0.0;
        System.out.println("Введите 1-e основание.");
        S1 = sc.nextDouble();
        Double S2 = 0.0;
        System.out.println("Введите 2-е основание.");
        S2 = sc.nextDouble();
        Double S3 = 0.0;
        System.out.println("Введите 1-ю боковую сторону.");
        S3 = sc.nextDouble();
        Double S4 = 0.0;
        System.out.println("Введите 2-ю боковую сторону.");
        S4 = sc.nextDouble();
        double S = ((S1+S2)/2)*Math.sqrt(S3*S3-Math.pow(((S2-S1)*(S2-S1)+S3*S3-S4*S4)/(2*(S2-S1)),2));
        return S;
    }
}

package task1;

import java.util.Scanner;

public class Circle extends Figure2D {
    @Override
    double area() {
        Scanner sc = new Scanner(System.in);
        Double R = 0.0;
        System.out.println("Введите радиус.");
        R = sc.nextDouble();
        Double S = R*R*3.14;
        return S;
    }

}
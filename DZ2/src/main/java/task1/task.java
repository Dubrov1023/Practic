package task1;

import java.util.Scanner;

public class task {
    public static void main (String [] arr){
        System.out.println("Выберете основание призмы");
        System.out.println("1. Круг");
        System.out.println("2. Квадрат");
        System.out.println("3. Трапеция");
        System.out.println("4. Треунольник");
        int i = 0;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        System.out.println("Введите высоту призмы");
        double h = sc.nextDouble();
        if (i == 1) {
            Circle base = new Circle();
            Prizm count = new Prizm(base, h);
            count.volume();
        };
        if (i == 2) {
            Rect base = new Rect();
            Prizm count = new Prizm(base, h);
            count.volume();
        };
        if (i == 3) {
            Trap base = new Trap();
            Prizm count = new Prizm(base, h);
            count.volume();
        };
        if (i == 4) {
            Tri base = new Tri();
            Prizm count = new Prizm(base, h);
            count.volume();
        };
    }
}

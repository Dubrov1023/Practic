import java.util.Scanner;

public class Poisk {
    public static void main(String[] args){
        long Right = 2_147_483_647;
        long Left = 0;
        long Median = 0;
        int Choce = 0;
        int Popitka = 1;
        System.out.println("Давайте начнем!");
        System.out.println("Загадайте число от 0 до 2 147 483 647.");
        while ((Choce != 3) & (Popitka < 32)) {
            System.out.print("Попытка: ");
            System.out.println(Popitka);
            Median = (Left + Right)/2;
            System.out.print("Сравните его с числом ");
            System.out.println(Median);
            System.out.println("1. Больше");
            System.out.println("2. Меньше");
            System.out.println("3. Равно");
            Scanner in = new Scanner(System.in);
            Choce = in.nextInt();
            Popitka ++;
            if (Choce == 1){
                Left = Median;
            } else {
                if (Choce == 2) {
                    Right = Median;
                } else {
                    System.out.println("ДА?! Правда?");
                    System.out.println("1.ДА!");
                    System.out.println("2.Нет.");
                    Choce = in.nextInt();
                    if (Choce == 1){
                        System.out.println("Ты крут, кожаный человек! Удачи!");
                    } else {
                        System.out.println("Плохая шутка, живое существо.");
                    };
                   Popitka = 100;
                };
            };
        };
    }
}

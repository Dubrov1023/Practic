package task3;

import java.util.Scanner;

public class Program{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите температуру в Цельсия");
        Double Degree = sc.nextDouble();
        Converter printable = new Kelvin(Degree);
        printable.convert();
        printable = new Faringeit(Degree);
        printable.convert();      // Foreign Policy
    }
}
interface Converter{

    void convert();
}
class Kelvin implements Converter{

    Double DegreeK;

    Kelvin(Double Degree){

        this.DegreeK = Degree+273.15;
    }

    public void convert() {

        System.out.print("Температура в Кельвинах: ");
        System.out.println(DegreeK);
    }
}
class Faringeit implements Converter {

    Double DegreeF;

    Double getName(){
        return DegreeF;
    }

    Faringeit(Double Degree){

        this.DegreeF = 9*Degree/5+32;
    }
    public void convert() {
        System.out.print("Температура в Фаренгейтах: ");
        System.out.println(DegreeF);
    }
}


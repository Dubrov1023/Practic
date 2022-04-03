package task2;

import java.util.Scanner;

public class task{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите оплату за час.");
        Double Hour = sc.nextDouble();
        Employee_hour Sam = new Employee_hour("Sam", Hour);
        Sam.display();
        System.out.println("Введите зарплату");
        Double Zarplata = sc.nextDouble();
        Employee_stable Bob = new Employee_stable("Bob", Zarplata);
        Bob.display();
    }
}
abstract class Person {

    private String name;

    public String getName() { return name; }

    public Person(String name){

        this.name=name;
    }

    public abstract void display();
}

class Employee_hour extends Person{

    private Double Stavka;

    public Employee_hour(String name, double Hour) {

        super(name);
        this.Stavka = 20.8*8*Hour;
    }

    public void display(){

        System.out.printf("Почасовой работник Имя: %s \t Ставка: %s \n", super.getName(), Stavka);
    }
}

class Employee_stable extends Person
{
    private double Stavka;

    public Employee_stable(String name, double Zarplata) {

        super(name);
        this.Stavka = Zarplata;
    }

    public void display(){

        System.out.printf("Договорной работник Имя: %s \t Зарплата: %s \n", super.getName(), Stavka);
    }
}

package task1;

public class Prizm {
    private Figure2D base;
    private double h;

    public Prizm(Figure2D base, double h) {
        this.base = base;
        this.h = h;
    }

    // метод вычисления объема
    public double volume() {
        Double V = base.area()*h;
        System.out.println(V);
        System.out.println("Объём призмы:");
        return V; };

}

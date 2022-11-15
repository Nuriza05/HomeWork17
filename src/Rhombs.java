public class Rhombs extends Shape{
    private int a,b,c,d;

    public Rhombs(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getPerimetr() {
        int p = 4*a;
        return p;
    }

    @Override
    public String toString() {
        return "Rhombs{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}

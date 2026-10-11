package problem6;

public class Square extends Forme {
    private double  x;
    public Square(double x) {
        this.x = x;
    }
    public double getSurface() {
        return Math.round(x * x * 100.0) / 100.0;
    }
    public String toString() {
        return "Square (side " + x + " cm)";
    }


}

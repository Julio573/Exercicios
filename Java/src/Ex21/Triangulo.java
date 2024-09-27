package Ex1;

public class Triangulo {
    public double A, B, C;

    public double medidas() {
        double P = (A + B + C) / 2;
        return Math.sqrt(P * (P - A) * (P - B) * (P - C));

    }
}

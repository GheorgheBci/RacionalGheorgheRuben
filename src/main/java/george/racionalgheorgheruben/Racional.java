package george.racionalgheorgheruben;

/**
 *
 * @author Jorge
 */
public class Racional {

    private int a;
    private int b;

    public Racional() {
        this.a = 1;
        this.b = 1;
    }

    public Racional(int a, int b) {
        this.a = a;
        if (b == 0) {
            this.b = 1;
        }

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        if (b == 0) {
            this.b = 1;
        }
    }

    public void imprimirConsola() {
        System.out.println("Número racional " + a + "/" + b);
    }

    @Override
    public String toString() {
        return "Racional = " + +a + "/" + b;
    }

    public void suma(int c, int d) {
        int suma;
        if (b == d) {
            suma = a * d + b * c / b;
        } else {
            suma = (a * d + b * c) / b * d;
        }

    }
}

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
        if (this.b == 0) {
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

    public void suma(Racional racional1 ) {
        if (this.b == racional1.getB()) {
            this.a += racional1.getA();
        } else {
            this.a *= (this.a*racional1.getB()) + (this.b* racional1.getA());
            this.b *= racional1.getB();
        }

    }
}

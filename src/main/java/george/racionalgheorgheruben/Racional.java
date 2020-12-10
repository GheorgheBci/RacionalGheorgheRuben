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
        if (b == 0){
            this.b = 1;
        }
        
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

}

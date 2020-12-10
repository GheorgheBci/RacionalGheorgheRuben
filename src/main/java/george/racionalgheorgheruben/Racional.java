package george.racionalgheorgheruben;

import java.util.Random;

/**
 *
 * @author Jorge
 */
public class Racional {

    // Atributos de la clase Racional
    private int a;
    private int b;

    // Constructor por defecto
    public Racional() {
        this.a = 1;
        this.b = 1;
    }

    //Constructor con parametros
    public Racional(int a, int b) {
        this.a = a;
        if (this.b == 0) {
            this.b = 1;
        }

    }

    //Metodos getter
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    // Métodos set 
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        // Controlamos que si el denominador es 0, se le cambia el valor a un 1
        if (b == 0) {
            this.b = 1;
        }
    }

    // Método imprimiConsola que muestra el valor de a y b
    public void imprimirConsola() {
        System.out.println("Número racional " + a + "/" + b);
    }

    //Método toString
    @Override
    public String toString() {
        return "Racional = " + +a + "/" + b;
    }

    //Método suma
    public void suma(Racional racional1) {
        if (this.b == racional1.getB()) {
            this.a += racional1.getA();
        } else {
            this.a *= (this.a * racional1.getB()) + (this.b * racional1.getA());
            this.b *= racional1.getB();
        }

    }

    // Método resta
    public void resta(Racional racional) {
        if (racional.getB() == this.b) {
            this.a -= racional.getA();
        } else {
            this.a = (this.a * racional.getA()) - (this.b * racional.getB());
            this.b *= racional.getB();
        }
    }

    //Método multiplicación
    public void multiuplicacion(Racional racional1) {
        this.a *= racional1.getA();
        this.b *= racional1.getB();
    }

    // Método de clase división
    public static double division(Racional racionalX, Racional racionalY) {
        return (racionalX.getA() * racionalY.getB()) / (racionalY.getB() * racionalX.getA());
    }

    //Método igualdad
    public static boolean igualdad(Racional racional1, Racional racional2) {

        if (racional1.getA() * racional2.getB() == racional2.getB() * racional1.getA()) {

        }
        return (racional1 == racional2);
    }

    // Métodod de clase aleatorio que devuelve un número racional aleatorio
    public static int aleatorio() {
        Random random = new Random();

        int numerador = random.nextInt();
        int denominador = random.nextInt();

        do {
            denominador = random.nextInt();
        } while (denominador == 0);

        return numerador / denominador;
    }
}

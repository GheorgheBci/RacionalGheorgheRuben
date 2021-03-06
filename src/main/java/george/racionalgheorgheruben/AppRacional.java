package george.racionalgheorgheruben;

/**
 *
 * @author Jorge
 */
public class AppRacional {

    public static void main(String[] args) {

        // Creamos dos objetos Racional con sus valores correspondientes
        Racional r1 = new Racional(4, 5);
        Racional r2 = new Racional(3, 4);

        //Creamos el Racional con variables aleatorias
        Racional.aleatorio();

        r1.imprimirConsola();
        r2.imprimirConsola();
        System.out.println(Racional.aleatorio());

        // Comparamos usando el método igualdad los dos objetos
        System.out.println(Racional.igualdad(r1, r2));

        //Realizamos la llamada z.suma(k)
        r1.suma(r2);
        System.out.println(r1);

        // Dividimos r1 entre r2 y mostramos el resultado
        System.out.println(Racional.division(r1, r2));

    }
}

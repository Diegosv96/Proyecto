import java.util.ArrayList;
import java.util.List;

public class Ej {

    public static void main(String[] args) {

        Integer cantidad;

        cantidad = 0;
        for (int i = 1; i < 250; i++) {
            if (i % 3 == 0) {
                //System.out.println(i);
                cantidad = cantidad + 1;
            }
        }

        System.out.println("cantidad de multiplos: " + cantidad);

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(2,34);
        numeros.add(4);

        System.out.println("Array: " + numeros.get(2) + " " + numeros);

    }
}

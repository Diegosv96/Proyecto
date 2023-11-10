//import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String nombre = "Diego";

        /*Scanner scan = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        Integer numero = scan.nextInt();
        scan.close();*/

        int numero = 37;

        System.out.println(nombre + ' ' + numero);

        Integer num = App.ejercicio(numero);
        System.out.println(num);

        App app = new App();
        System.out.println(app.ejercicio2(num));

    }

    public static Integer ejercicio(Integer num) {

        num++;

        return num;
    }

    private String ejercicio2(Integer n) {

        String cadena = "";
        
        for (Integer i = 0; i < n; i++) {
            cadena += "a";
            cadena = cadena.concat("b");
        }

        return cadena;
    }
    
}

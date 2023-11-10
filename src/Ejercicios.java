import java.util.Scanner;

public class Ejercicios {

    public static void main(String Array[]) {

        Double[] salarios = new Double[4];
        salarios[0] = 15000.0;
        salarios[1] = 25000.0;
        salarios[2] = 55000.0;
        salarios[3] = 80000.0;

        String[] sexos = { "H", "h", "M", "m", "s", "H", "m" };

        Ejercicios ejercicios = new Ejercicios();
        ejercicios.ejercicio1(salarios);
        ejercicios.ejercicio2(sexos);

        Scanner scan = new Scanner(System.in);

        String nombre = "";
        String apellido1 = "";
        String apellido2 = "";
        Double[] salario = new Double[1];
        String[] genero = new String[1];

        while (!nombre.equals("FIN")) {
            System.out.println("\nnombre: ");
            nombre = scan.nextLine();
            if (nombre.equals("FIN")) {
                break;
            }
            System.out.println("Apellido 1: ");
            apellido1 = scan.nextLine();
            System.out.println("Apellido 2: ");
            apellido2 = scan.nextLine();
            System.out.println("Salario: ");
            String salarioStr = scan.nextLine();
            salario[0] = Double.valueOf(salarioStr);
            System.out.println("Genero H o M: ");
            genero[0] = scan.nextLine();

            ejercicios.ejercicio3(nombre, apellido1, apellido2);
            ejercicios.ejercicio1(salario);
            ejercicios.ejercicio2(genero);

        }
        
        scan.close();

    }
    
    public void ejercicio1(Double[] arr) {

        for (double salario : arr) {

            String salida;
            if (salario < 20000) {
                salida = salario + " - Salario bajo";
            } else if (salario < 40000) {
                salida = salario + " - Salario medio";
            } else if (salario < 70000) {
                salida = salario + " - Salario alto";
            } else if (salario >= 70000) {
                salida = salario + " - Salario muy alto";
            } else {
                salida = "Error salario";
            }
            
            System.out.println("\n" + salida);

        }
    }
    
    public void ejercicio2(String[] sexos) {

        String sal;
        for (String sex : sexos) {
            switch (sex) {

                case "H", "h":
                    sal = "Hombre";
                    break;

                case "M", "m":
                    sal = "mujer";
                    break;

                default:
                    sal = "Error sexo";
                    break;
            }

            System.out.println("\n" + sal);
        }
    }
    
    public void ejercicio3(String nombre, String apellido1, String apellido2) {
        System.out.println("\n" + nombre + " " + apellido1 + " " + apellido2);
    }
    
}

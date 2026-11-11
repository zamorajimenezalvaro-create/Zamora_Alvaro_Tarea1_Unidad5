/*
 * 1. Implementa y completa el siguiente programa. Ten en cuenta que cuando se entre en cada una de las opciones (1,2 o 3)
 *    el programa realice su función. Esto es, si se selecciona la opción 1, el programa debe entrar en la parte de calcular
 *    el área de un cuadrado y debe solicitar los dos lados y mostrar el resultado. Así con el resto de opciones.
*/

import java.util.Scanner;

public class CalculoAreas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        while (opcion < 1 || opcion > 4) {
            System.out.println("Opción inválida. Por favor, seleccione una opción de la lista.");
            System.out.print("Elija una opción: ");
            opcion = entrada.nextInt();
        }
        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");
            System.out.print("Ingrese la base (o lado 1): ");
            double lado1 = entrada.nextDouble();
            System.out.print("Ingrese la altura (o lado 2): ");
            double lado2 = entrada.nextDouble();
            double areaCuadrado = lado1 * lado2;
            System.out.println("El área del cuadrado es: " + areaCuadrado);
        } else {
            if (opcion == 2) {
                System.out.println("Ha seleccionado calcular el área de un triángulo...");
                System.out.print("Ingrese la base: ");
                double base = entrada.nextDouble();
                System.out.print("Ingrese la altura: ");
                double altura = entrada.nextDouble();
                double areaTriangulo = (base * altura) / 2;
                System.out.println("El área del triángulo es: " + areaTriangulo);
            } else {
                if (opcion == 3) {
                    System.out.println("Ha seleccionado calcular el área de un círculo...");
                    System.out.print("Ingrese el radio: ");
                    double radio = entrada.nextDouble();
                    double areaCirculo = Math.PI * Math.pow(radio, 2);
                    System.out.println("El área del círculo es: " + areaCirculo);
                } else {
                    if (opcion == 4) {
                        System.out.println("Ha seleccionado terminar.");
                    }
                }
            }
        }

        entrada.close();
    }
}

# ENUNCIADO
 
Yolanda está estudiando el ciclo de grado superior de DAM (Desarrollo de aplicaciones multiplataforma) en el IES Miguel Hernández. Por motivos laborales comenzó el curso una semana más tarde y la asignatura de programación le está costando un poco. Como sabe que tu has estudiado lo mismo el mismo ciclo formativo que ella, te propone que le impartas clases particulares. Realiza los siguientes ejercicios junto a Yolanda y comenta todo el código.
 
 
 
1. Implementa y completa el siguiente programa. Ten en cuenta que cuando se entre en cada una de las opciones (1,2 o 3) el programa realice su función. Esto es, si se selecciona la opción 1, el programa debe entrar en la parte de calcular el área de un cuadrado y debe solicitar los dos lados y mostrar el resultado. Así con el resto de opciones.

```java
public class MenuCalculos {

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

        if (opcion == 1) {

            System.out.println("Ha seleccionado calcular el área de un cuadrado...");

        } 

  else { 

if (opcion == 2) {

             System.out.println("Ha seleccionado calcular el área de un triángulo...");

         } 

else { 

if (opcion == 3) {

             System.out.println("Ha seleccionado calcular el área de un círculo...");

         } 

else {

             System.out.println("Ha seleccionado terminar");

        }     

    }

  }
  ```

2. Crea un programa que te pida el nombre, los apellidos, la edad, el lugar de nacimiento y tu cumpleaños, puedes mostrar los datos utilizando JoptionPane. Puedes usar el siguiente enlace para ampliar información: https://www.laurafolgado.es/desarrollointerfaces/2015/10/cuadros-de-dialogo-con-joptionpane/
 
3. Investiga un poco más el uso de las sentencias de salto en java y utiliza alguna de ellas en el código que has creado en el ejercicio anterior. Utiliza las herramientas de depuración de código que ya hemos visto anteriormente.
Puedes ampliar información en este enlace: https://programandoointentandolo.com/2014/05/break-y-continue-en-java.html

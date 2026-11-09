/**
 * 3. Investiga un poco más el uso de las sentencias de salto en java y utiliza alguna de ellas en el código que has
 *    creado en el ejercicio anterior. Utiliza las herramientas de depuración de código que ya hemos visto anteriormente.
*/

import javax.swing.JOptionPane;

public class DatosPersonales2 {
    public static void main(String[] args) {
        
        // Uso de bucle infinito controlado mediante sentencias de salto (break y continue)
        while (true) {
            String nombre = JOptionPane.showInputDialog(null, "Introduce tu nombre:", "Datos personales", JOptionPane.QUESTION_MESSAGE);
            
            // Sentencia de salto: 'break' si se pulsa Cancelar o la 'X' (retorna null)
            if (nombre == null) {
                JOptionPane.showMessageDialog(null, "Ha cancelado la introducción de datos. Saliendo...", "Salida", JOptionPane.WARNING_MESSAGE);
                break; // Interrumpe el bucle y finaliza el programa
            }

            // Sentencia de salto: 'continue' si el usuario deja el nombre vacío
            if (nombre.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El nombre no puede estar vacío. Inténtalo de nuevo.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
                continue; // Salta el resto de líneas del bucle y vuelve al inicio del 'while'; el '.trim()' se encarga de eliminar los espacios en blanco
            }

            String apellidos = JOptionPane.showInputDialog(null, "Introduce tus apellidos:", "Datos personales", JOptionPane.QUESTION_MESSAGE);
            if (apellidos == null) break;

            String edadStr = JOptionPane.showInputDialog(null, "Introduce tu edad:", "Datos personales", JOptionPane.QUESTION_MESSAGE);
            if (edadStr == null) break;

            String lugarNacimiento = JOptionPane.showInputDialog(null, "Introduce tu lugar de nacimiento:", "Datos personales", JOptionPane.QUESTION_MESSAGE);
            if (lugarNacimiento == null) break;

            String cumpleanos = JOptionPane.showInputDialog(null, "Introduce la fecha de tu cumpleaños (ej. 19 de Febrero):", "Datos personales", JOptionPane.QUESTION_MESSAGE);
            if (cumpleanos == null) break;

            String mensaje = "=== DATOS INTRODUCIDOS ===\n"
                    + "Nombre: " + nombre + "\n"
                    + "Apellidos: " + apellidos + "\n"
                    + "Edad: " + edadStr + " años\n"
                    + "Lugar de nacimiento: " + lugarNacimiento + "\n"
                    + "Cumpleaños: " + cumpleanos;

            JOptionPane.showMessageDialog(null, mensaje, "Ficha personal", JOptionPane.INFORMATION_MESSAGE);

            // Preguntar al usuario si desea realizar otro registro
            int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas registrar otra persona?", "Nuevo registro", JOptionPane.YES_NO_OPTION);
            
            // Sentencia de salto: 'break' si selecciona 'No' (JOptionPane.NO_OPTION) o cierra la ventana
            if (opcion != JOptionPane.YES_OPTION) {
                break;
            }
        }

        System.out.println("Fin del programa.");
    }
}

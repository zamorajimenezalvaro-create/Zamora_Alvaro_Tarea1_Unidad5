/**
 * 2. Crea un programa que te pida el nombre, los apellidos, la edad, el lugar de nacimiento y tu cumpleaños,
 *    puedes mostrar los datos utilizando JoptionPane.
*/

import javax.swing.JOptionPane;

public class DatosPersonales1 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null, "Introduce tu nombre:", "Datos Personales", JOptionPane.QUESTION_MESSAGE);
        String apellidos = JOptionPane.showInputDialog(null, "Introduce tus apellidos:", "Datos Personales", JOptionPane.QUESTION_MESSAGE);
        String edadStr = JOptionPane.showInputDialog(null, "Introduce tu edad:", "Datos Personales", JOptionPane.QUESTION_MESSAGE);
        String lugarNacimiento = JOptionPane.showInputDialog(null, "Introduce tu lugar de nacimiento:", "Datos Personales", JOptionPane.QUESTION_MESSAGE);
        String cumpleanos = JOptionPane.showInputDialog(null, "Introduce la fecha de tu cumpleaños (ej. 19 de Febrero):", "Datos Personales", JOptionPane.QUESTION_MESSAGE);

        String mensaje = "=== DATOS INTRODUCIDOS ===\n"
                + "Nombre: " + nombre + "\n"
                + "Apellidos: " + apellidos + "\n"
                + "Edad: " + edadStr + " años\n"
                + "Lugar de nacimiento: " + lugarNacimiento + "\n"
                + "Cumpleaños: " + cumpleanos;

        JOptionPane.showMessageDialog(null, mensaje, "Ficha Personal", JOptionPane.INFORMATION_MESSAGE);
    }
}
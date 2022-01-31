package Projects;


import javax.swing.*; //Joptionpane ventana emergente

public class DatosJoptionPane {

    public static void main (String[] args){
        String cadena;
        int entero;
        char letra;
        double decimal;

            cadena = JOptionPane.showInputDialog("Digite una cadena: ");
            entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero: "));//Se necesita volver integer para introducir enteros
            letra = JOptionPane.showInputDialog("Digite un catacer: ").charAt(0);//se agrega charat para que sea tipo char
            decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));//Necesita convertirse  a tipo double

        // System.out.println("La cadena es: "+cadena);
        // System.out.println("El entero es: "+entero);
        //System.out.println("La letra es: "+letra);
        //System.out.println("El decimal es: "+decimal);

        //Escribir datos en pantalla SALIDA DE DATOS

        JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null, "El entero es: "+entero);
        JOptionPane.showMessageDialog(null, "El caracter es: "+letra);
        JOptionPane.showMessageDialog(null, "El decimal es: "+decimal);



    }

}

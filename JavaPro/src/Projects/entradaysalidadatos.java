package Projects;

import java.util.Scanner;

public class entradaysalidadatos {

    public static void main (String[] args){

       

        int numero;
        float numero2;
        double numero3;
        String cadena;
        char caracter;

        System.out.print("Digitar un numero entero: ");
        numero = extracted().nextInt();
        System.out.print("Digite un numero decimal: ");
        numero2 = extracted().nextFloat();
        System.out.print("Digitar un numero decimal tipo double: ");
        numero3 = extracted().nextDouble();
        System.out.print("Digite una cadena: ");
        cadena = extracted().nextLine();
        System.out.print("Digite un caracter: ");
        caracter = extracted().next().charAt(0);

        System.out.println("El numero es :"+numero);
        System.out.println("El segundo numero es: "+numero2);
        System.out.println("El tercer numero es: "+numero3);
        System.out.println("La cadena es: "+cadena);
        System.out.println("La cadena es: "+caracter);


    }

	private static Scanner extracted() {
		return new Scanner (System.in);
	}

}

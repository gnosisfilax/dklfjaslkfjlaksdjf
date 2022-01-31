package Projects;

import java.util.Scanner;

public class operadores {

    private static Scanner entrada;

	public static void main (String[] args){

        entrada = new Scanner(System.in);

        float numero1,numero2,suma,resta,multiplicacion,division,residuo;

        System.out.println("Digite dos numeros: ");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();

        suma = numero1+numero2;
        resta = numero1-numero2;
        multiplicacion = numero1*numero2;
        division = numero1/numero2;
        residuo = numero1%numero2;

        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
        System.out.println("El residuo es: "+residuo);

    }
}

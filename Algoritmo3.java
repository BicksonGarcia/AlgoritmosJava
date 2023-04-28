import java.util.*;

public class Algoritmo3{
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese 1 para hallar la Hipotenusa o 2 para hallar el Cateto faltante");
		int oper = entrada.nextInt();

		if((oper!=1) && (oper!=2)){
			System.out.println("No ingreso un numero dentro del rango indicado");
		}

		if(oper==1){
			System.out.println();
			System.out.println("Introduzca el valor de los catetos");
			System.out.println("NOTA: Si el numero es decimal, se debe escribir con una coma");

			double c1 = entrada.nextDouble();
			double c2 = entrada.nextDouble();
			double h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
			//Math.sqrt es una función matemática, específicamente una radiación

			System.out.println();
			System.out.println("La Hipotenusa tiene un valor de " + h);
		}
		
		if(oper==2){
			System.out.println();
			System.out.println("introduzca el valor de la Hipotenusa y luego el del Cateto faltante");
			System.out.println("NOTA: Si el numero es decimal, se debe escribir con una coma");

			double h = entrada.nextDouble();
			double c1 = entrada.nextDouble();
			double c2 = Math.sqrt(Math.pow(h, 2) - Math.pow(c1, 2));
			
			System.out.println();
			System.out.println("El Cateto faltante tiene un valor de " + c2);
		}
	}
}
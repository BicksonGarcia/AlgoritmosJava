//Es una clase que importa todos los métodos que se utilizarán en el programa, el asterisco indica que todos los métodos están importados
import java.util.Scanner;
//public class indica que cualquier clase desde cualquier paquete puede acceder al
public class Algoritmo1{
	public static void main(String[] args) {
		
		//Es una clase que importa todos los métodos que se utilizarán en el programa, el asterisco indica que todos los métodos están importados
		Scanner num = new Scanner(System.in);

		//Es una función que escribe texto en la siguiente línea
		System.out.println("Ingrese el valor de la base");
		//int es una variable de números enteros, acompañado de una función del scanner que es leer números enteros dados por el usuario
		int base = num.nextInt();

		System.out.println("Ingrese el valor de la altura");
		int altura = num.nextInt();

		int area = (base*altura);
		System.out.println();
		System.out.println("El Area del cuadrado es: " + area);
		
		int perimetro = ((2*base)+(2*altura));
		System.out.println();
		System.out.println("El Perimetro del cuadrado es: " + perimetro);

	}
}
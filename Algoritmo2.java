import java.util.Scanner;

public class Algoritmo2{
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);

		System.out.println("Ingrese 3 numeros diferentes");
		//Definiendo variables como números enteros
		int a = num.nextInt();
		int b = num.nextInt();
		int c = num.nextInt();
        
        //if es una declaración evalua los datos que se le dan, y en base a esos datos toma distintas desiciones
		if((a==b) || (a==c) || (b==c)){
			System.out.println("No ingreso 3 numeros diferentes");

		//else es complemento de if, no es necesario pero es utilizado para abarcar otras desiciones si el if no se cumple	
		} else{
			if((a<b) && (a<c)){
				System.out.println();
				System.out.println("El numero menor es " + a);
			}
			if((b<a) && (b<c)){
				System.out.println();
				System.out.println("El numero menor es " + b);
			}
			if((c<a) && (c<a)){
				System.out.println();
				System.out.println("El numero menor es " + c);
			}
		}
	}
}
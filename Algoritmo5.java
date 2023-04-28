import java.util.*;

public class Algoritmo5{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int oper;
		double resultado;

		System.out.println("Ingrese 2 valores a operar");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();

		do{ 
			System.out.println();
            System.out.println("Escriba el numero de la operacion que desea realizar");
        	System.out.println();
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicacion");
			System.out.println("4. Division");
			System.out.println();
			oper = sc.nextInt();
        }while(oper<1 || oper>4);

        //switch en pocas palabras es un if abreviado, se coloca un dato y en base a eso, toma diferentes desiciones
        switch(oper)
        {
        	case 1:
        		resultado = (num1 + num2);
        		System.out.println();
        		System.out.println("El resultado de la Suma es " + resultado);
        		break;
        		//break le indica a la función que debe terminar y que ya no continue ejecutando esa función y siga normalmente.
        	case 2:
        		resultado = (num1 - num2);
        		System.out.println();
        		System.out.println("El resultado de la Resta es " + resultado);
        		break;
        	case 3:
        		resultado = (num1 * num2);
        		System.out.println();
        		System.out.println("El resultado de la Multiplicacion es " + resultado);
        		break;
        	case 4:
        		if(num2>0){
        			resultado = (num1 / num2);
        			System.out.println();
        			System.out.println("El resutlado de la Division es " + resultado);
        			break;
        		}
        		if(num2==0){
        			System.out.println();
        			System.out.println("Resultado no definido");
        			break;
        		}
        }
	}
}
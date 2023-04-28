import java.util.*;

public class Algoritmo4{
	public static void main(String[] args) {

		int num;
		int exp;
		int digito;
        double bin;

        Scanner sc = new Scanner(System.in);

        //DO WHILE es una herramienta usada para hacer ciclos, realizando una acción cada que el while se repite
        do{ 
            System.out.println("Ingrese un numero a convertir entre 1-10:");                                                
            num = sc.nextInt();
        }while(num<=0 || num>10);
        
        exp=0;
        bin=0;

        while(num!=0){
                digito = num%2;           
                bin = bin + digito * Math.pow(10, exp); //Math.pow es una función matemática, específicamente una potencia                                            
                exp++;
                num = num/2;
        }
        System.out.printf("El numero convertido a binario es: %.0f %n", bin);
	}
}
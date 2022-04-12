package entornos;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		int numero1=0, numero2=0, resultado=0, contador=1, operacion=0, opcion=0;
		System.out.println("Calculadora interactiva "				);
		
		
		do {
			System.out.println("Selecciona la operación que quieres realizar\n"
								+ "1 para sumar\n"
								+ "2 para restar \n"
								+ "3 para multiplicar \n"
								+ "4 para dividar \n"
								+ "5 para salir.\n");
			
			opcion= Integer.parseInt(consola.nextLine());
			
			if( opcion >=1 && opcion<=4) {	
				System.out.println("Proporciona el primer numero");
				numero1= Integer.parseInt(consola.nextLine());
				System.out.println("Proporciona el segundo numero");
				numero2= Integer.parseInt(consola.nextLine());
			}
			
			switch (opcion) {
			case 1:
				suma(numero1, numero2);
				break;
			case 2:
				
				resta(numero1, numero2);
				break;
			case 3:
				multiplicacion(numero1, numero2);
				break;
			case 4:
				division(numero1, numero2);
					
				break;
			case 5:
				System.out.println("¡Hasta luego! Gracias por usarme");
				
				break;
			default: System.out.println("La opción no es valida");
		
			}
			
			
			//System.out.println("¿Qué deseas hacer a continuación?");
		}while(opcion<=4);
		

	}
	
	public static int suma(int numero1, int numero2) {
		int resultado=0;
		resultado=numero1+numero2;
		return resultado;
	}

	public static int resta(int numero1, int numero2) {
		int resultado=0;
		resultado=numero1-numero2;
		return resultado;
	}
	
	public static int multiplicacion(int numero1, int numero2) {
		int resultado=0;
		resultado=numero1*numero2;
		return resultado;
	}
	public static int division(int numero1, int numero2) {
		int resultado=0;
		if(numero2 != 0) {
			resultado=numero1/numero2;
	
		
		}else {
			System.out.println("El numero no es divisible por 0");
		}
		return resultado;
	}
	}



package EX_1;
import java.util.*;


class SomarDoisNumeros {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		//Declaração de variaveis
		int num1;
		int num2, soma;
		
		//Leitura
		System.out.println("Digite um numero");
		num1 = sc.nextInt();
		System.out.println("Digite um numero");
		num2 = sc.nextInt();
		
		//somar
		soma = num1 + num2;
		
		//mostrar na tela
		System.out.println("Soma:" + soma);
		
	}
	
	
}

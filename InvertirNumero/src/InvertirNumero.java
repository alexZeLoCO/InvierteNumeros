import java.util.Scanner;		//IMPORTAR SCANNER
public class InvertirNumero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		System.out.print("Introduca un número: ");		//SOLICITA VALOR
		
	//-------INICIALIZACIÓN VARIABLES---------
		int n = teclado.nextInt();		//ALMACENA VALOR EN N
		int n_inv = 0;		//INICIALIZA N_INV (NÚMERO INVERSO)
		int cifra = 0;		//INICIALIZA CIFRA (CRIFRA A AÑADIR AL INVERSO)
		
	//---------PRIMER TRATAMIENTO DEL VALOR-----------
		cifra=n%10;		//PRIMERA CIFRA DE N
		n_inv=cifra;		//AÑADIR CIFRA AL N_INV
		n=n/10;		//QUITA CIFRA DE N
		
	//------------RESTO DE CIFRAS-----------
		while(n>0) {		//MIENTRAS EL NÚMERO SEA MAYOR QUE 1 (QUEDAN CIFRAS)
			cifra=n%10;		//SIGUIENTE CIFRA
			n_inv=n_inv*10+cifra;		//INCLUIR CIFRA AL INVERSO
			n=n/10;		//QUITAR CIFRA DEL NÚMERO
		}
		
				//OUTPUT
		System.out.printf("El número inverso es: %d",n_inv);
	}
}

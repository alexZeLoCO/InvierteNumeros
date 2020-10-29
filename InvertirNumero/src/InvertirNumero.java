import java.util.Scanner;		//IMPORTAR SCANNER
public class InvertirNumero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		System.out.print("Introduca un n�mero: ");		//SOLICITA VALOR
		
	//-------INICIALIZACI�N VARIABLES---------
		int n = teclado.nextInt();		//ALMACENA VALOR EN N
		int n_inv = 0;		//INICIALIZA N_INV (N�MERO INVERSO)
		int cifra = 0;		//INICIALIZA CIFRA (CRIFRA A A�ADIR AL INVERSO)
		
	//---------PRIMER TRATAMIENTO DEL VALOR-----------
		cifra=n%10;		//PRIMERA CIFRA DE N
		n_inv=cifra;		//A�ADIR CIFRA AL N_INV
		n=n/10;		//QUITA CIFRA DE N
		
	//------------RESTO DE CIFRAS-----------
		while(n>0) {		//MIENTRAS EL N�MERO SEA MAYOR QUE 1 (QUEDAN CIFRAS)
			cifra=n%10;		//SIGUIENTE CIFRA
			n_inv=n_inv*10+cifra;		//INCLUIR CIFRA AL INVERSO
			n=n/10;		//QUITAR CIFRA DEL N�MERO
		}
		
				//OUTPUT
		System.out.printf("El n�mero inverso es: %d",n_inv);
	}
}

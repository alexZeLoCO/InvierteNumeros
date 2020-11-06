import java.util.Scanner;
/**
 * @author User
 *	EL PROGRAMA DEBE INVERTIR NÚMEROS.
 *	SI SE INTRODUCE 4896, EL PROGRAMA DEVUELVE 6984.
 */

public class InversorNumeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int n = teclado.nextInt();
		int N_Inv =0;
		while (n/10>0) {
			int cifra = n%10;
			N_Inv = N_Inv*10+cifra;
			n=n/10;
		}
		System.out.printf("%d",N_Inv);
	}

}

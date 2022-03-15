import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nombre, apellido, ine;
		int numeroCuenta, nCuentas;
		double saldo;
		Cuenta cuentas[];
		Cliente cliente;
		
		System.out.println("Nombre del Cliente");
		nombre = entrada.nextLine();
		System.out.println("Apellido del Cliente");
		apellido = entrada.nextLine();
		System.out.println("INE del Cliente");
		ine = entrada.nextLine();
		System.out.println("Cuentas cuentas Requiere");
		nCuentas = entrada.nextInt();
	
		cuentas = new Cuenta[nCuentas];
		
		for(int i = 0; i<cuentas.length; i++) {
		
			System.out.println("Ingrese los datos Para la cuenta: "+ (i+1));
			System.out.println("Numero de Cuenta:");
			numeroCuenta = entrada.nextInt();
			System.out.println("Saldo para la cuenta:");
			saldo = entrada.nextDouble();
			
			// Se mandara a llamar el contructor de la clase Cuenta
			cuentas[i] = new Cuenta(numeroCuenta, saldo);
			
		}

	}

}

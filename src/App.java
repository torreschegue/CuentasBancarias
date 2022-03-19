import java.util.Scanner;

public class App {
	
	public static int buscarNumeroCuenta(Cuenta cuentas[], int n) {
		int i = 0, indice =0;
		boolean encontre = false; // Este va encontrar el la cuenta
		// Busqueda Secuencial
		while((i<cuentas.length) && (encontre == false)) {
			if(cuentas[i].getNumeroCuenta() == n) { 
				encontre = true;
				indice = i;
			}
			
			i++;
		}
		// Si no encuentra el numero de cuenta Regresa -1
		if(encontre == false) {
			indice = -1;
		}
		
		return indice;
	}
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nombre, apellido, ine;
		int numeroCuenta, nCuentas, opcion, indiceCuenta;
		double saldo, cantidadDeposito;
		Cuenta cuentas[]; // Objeto de Arreglos
		Cliente cliente;
		
		System.out.println("Nombre del Cliente");
		nombre = entrada.nextLine();
		System.out.println("Apellido del Cliente");
		apellido = entrada.nextLine();
		System.out.println("INE del Cliente");
		ine = entrada.nextLine();
		System.out.println("Cuentas cuentas Requiere");
		nCuentas = entrada.nextInt();
	
		// Definiendo Numero de cuentas
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
		
		// Se manda a llamar el contructor
		// se Crea el cliente.
		cliente = new Cliente(nombre, apellido, ine, cuentas);
		
		
		
		
		// Menu Dinamico
		do {
			System.out.println("\t.:MENU:.");
			System.out.println("1.- Ingresar Dinero en la Cuenta:");
			System.out.println("2.- Retirar Dinero de la Cuenta:");
			System.out.println("3.- Consultar Saldo:");
			System.out.println("4.- Salir");
			System.out.println("Dijete la Opcion de Menu:");
			opcion = entrada.nextInt();
			
			switch(opcion) {
			
			case 1:
				
				System.out.println("\n Dijete el Numero de Cuenta:");
				numeroCuenta = entrada.nextInt();
				// Indice, ArreglodeCuentas -> Metodo de Busqueda
				indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
				if(indiceCuenta == -1) {
					System.out.println("Cuenta Ingresada No Existente");
				}else {
					System.out.println("\n Digite la Cantidad a Depositar");
					cantidadDeposito = entrada.nextDouble();
					cliente.ingresarDinero(indiceCuenta, cantidadDeposito);
					System.out.println("\n Deposito Exitoso ..., Graias por su confianza");
					System.out.println("Saldo Disponoble: " + cliente.consultarSaldo(indiceCuenta));
				}
				
				break;
				
			case 2:
				break;
			case 3:
				break;
			
			}
			
		}while(opcion != 4);
		
		
		
	}
		
	}



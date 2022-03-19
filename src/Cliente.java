
public class Cliente {
	private String nombre;
	private String apellido;
	private String ine;
	Cuenta cuentas[]; // Arreglo de Objeto
	
	public Cliente(String nombre, String apellido, String ine, Cuenta[] cuentas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.ine = ine;
		this.cuentas = cuentas;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getIne() {
		return ine;
	}
	
	public double consultarSaldo(int indice) {
		return cuentas[indice].getSaldo();
	}
	
	public void ingresarDinero(int indice, double cantidad) {
		cuentas[indice].ingresarDinero(cantidad);
	}
	
	public void retirarDinero(int indice, double cantidad) {
		cuentas[indice].retirarDinero(cantidad);
	}
	
	
}

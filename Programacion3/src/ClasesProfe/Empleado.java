package ClasesProfe;

public class Empleado {
	
	int id;
	String tipoEmpleado;
	
	public Empleado (int id, String tipoEmpleado){
		this.id=id;
		this.tipoEmpleado=tipoEmpleado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoEmpleado() {
		return tipoEmpleado;
	}

	public void setTipoEmpleado(String tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}

	public String toString(){
		return tipoEmpleado;
	}
}

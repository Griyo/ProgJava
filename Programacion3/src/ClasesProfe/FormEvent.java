package ClasesProfe;

import java.util.EventObject;

public class FormEvent extends EventObject {

	private String name;
	private String occupation;
	private int edad;
	private int empId;
	private String rangoEdad;
	private String empTipo;
	private String gender;
	private String nacionalidad;
	
	

	public FormEvent(Object arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	public FormEvent(Object e, String name, String occupation,int edad,
			int empId,String rangoEdad, String empTipo, String gender,String nacionalidad){
		super(e);
		this.name=name;
		this.occupation=occupation;
		this.edad=edad;
		this.empId=empId;
		this.rangoEdad=rangoEdad;
		this.empTipo=empTipo;
		this.gender=gender;
		this.nacionalidad=nacionalidad;
	}
	
	
	
	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmpTipo() {
		return empTipo;
	}

	public void setEmpTipo(String empTipo) {
		this.empTipo = empTipo;
	}
	
	public int getEmpId() {
		return empId;
	}

	public String getRangoEdad() {
		return rangoEdad;
	}

	public void setRangoEdad(String rangoEdad) {
		this.rangoEdad = rangoEdad;
	}

	public void setEmpId(int empId) {
		empId = empId;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
}

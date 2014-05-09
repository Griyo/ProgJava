package ClasesProfe;

import java.util.EventObject;

public class FormEvent extends EventObject {

	private String name;
	private int occupation;
	private int edad;
	private int empId;
	private String rangoEdad;
	private int empTipo;
	private String gender;
	private int nacionId;
	private int Id;
	
	

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public FormEvent(Object arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	
	public FormEvent(Object e, String name, int occupation,int edad,
			int empId, int empTipo, String gender,int nacionId){
		super(e);
		this.name=name;
		this.occupation=occupation;
		this.edad=edad;
		this.empId=empId;
		this.empTipo=empTipo;
		this.gender=gender;
		this.nacionId=nacionId;
	}
	public FormEvent(Object e, String name, int occupation,int edad,
			int empTipo, String gender,int nacionId){
		super(e);
		this.name=name;
		this.occupation=occupation;
		this.edad=edad;
		this.empTipo=empTipo;
		this.gender=gender;
		this.nacionId=nacionId;
	}
	
	
	
	public int getNacionId() {
		return nacionId;
	}

	public void setNacionId(int nacionId) {
		this.nacionId = nacionId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getEmpTipo() {
		return empTipo;
	}

	public void setEmpTipo(int empTipo) {
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

	public int getOccupation() {
		return occupation;
	}

	public void setOccupation(int occupation) {
		this.occupation = occupation;
	}
}

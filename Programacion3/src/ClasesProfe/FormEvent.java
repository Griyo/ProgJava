package ClasesProfe;

import java.util.EventObject;

public class FormEvent extends EventObject {

	private String name;
	private String occupation;
	private int edad;
	
	public FormEvent(Object arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	public FormEvent(Object e, String name, String occupation,int edad){
		super(e);
		this.name=name;
		this.occupation=occupation;		
		this.edad=edad;
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

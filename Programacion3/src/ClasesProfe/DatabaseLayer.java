package ClasesProfe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseLayer {
	
	private String sql;
	private Connection conn;
	private Statement stm;
	private ResultSet rs;
	
	private String server="localhost:3306";
	private String db = "progra3";
	private String user = "root";
	private String pass = "gaby13";
	
	

	TextPanel textPanel;
		
	public DatabaseLayer(){
		
		try {			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://"+server+"/"+db,user,pass);
			stm=conn.createStatement();			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("fallo");
			e.printStackTrace();
		}
	}
	
	public boolean isConnected(){
		try {
			return !conn.isClosed();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public void queryExec(String sql){
		try {
			stm.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void actQuery(FormEvent fe, String indice){
		try {
			String sql = "UPDATE trabajador "+ "SET "+"nombre ="+"'"+fe.getName()+"',"+
												    "ocupacion ="+"'"+fe.getOccupation()+"',"+
												    "tipoEmpleado="+"'"+fe.getEmpTipo()+"',"+
												    "edad="+fe.getEdad()+","+
												    "genero="+"'"+fe.getGender()+"',"+
												    "pais="+"'"+fe.getNacionalidad()+"'"+
												    " where idTrabajador="+indice+";";
			System.out.println(sql);
			stm.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void delQuery(String sql){
		try {			
			stm.executeUpdate(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<FormEvent> resultQuery(String sql){
		 ArrayList<FormEvent> dbList = new ArrayList<FormEvent>();
		try {
			rs = stm.executeQuery(sql);
			try {
				while(rs.next()){
					FormEvent item = new FormEvent(this);
					item.setId(rs.getInt("idTrabajador"));
					item.setEmpTipo(rs.getString("tipoEmpleado"));
					item.setName(rs.getString("nombre"));
					item.setOccupation(rs.getString("ocupacion"));
					item.setEdad(rs.getInt("edad"));
					item.setNacionalidad(rs.getString("pais"));
					item.setGender(rs.getString("genero"));
					System.out.println(rs.getInt("idTrabajador"));
					dbList.add(item);	
				}
				
				rs.close();
			} catch (SQLException i) {
				// TODO Auto-generated catch block
				i.printStackTrace();
			}
			return dbList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return dbList;
		}
	}
}

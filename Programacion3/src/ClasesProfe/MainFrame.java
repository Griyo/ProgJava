package ClasesProfe;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	
	private JButton btn;
	private TextPanel textPanel;
	private Toolbar toolbar;
	private FormPanel formPanel;
	private ArrayList<FormEvent> lista;
	DatabaseLayer dbl;
	
	public MainFrame() {
		super("Hello World");
		
		setLayout(new BorderLayout());
		
		lista = new ArrayList<FormEvent>();
		btn = new JButton("Click me");
		textPanel = new TextPanel();
		formPanel = new FormPanel();
		toolbar = new Toolbar();
		dbl = new DatabaseLayer();

		
		toolbar.setArrayList(lista);
		toolbar.setStringListener(new StringListener(){

			@Override
			public void textEmitted(String text) {
				// TODO Auto-generated method stub
				textPanel.appendText(text);
			}});

		toolbar.setArrayListener(new ArrayListener(){
			@Override
			public void ArrayEmitted(ArrayList<FormEvent> lista) {
				// TODO Auto-generated method stub
			
				if(dbl.isConnected()){
					ArrayList<FormEvent> list = dbl.resultQuery("select * from trabajador");
					for(FormEvent f:list){
						textPanel.appendText("ID: "+f.getId()+"\n"+
											 "Nombre: "+f.getName()+"\n"+
											 "ocupacion_Id: "+f.getOccupation()+"\n"+
											 "tipoEmpleado_Id: "+f.getEmpTipo()+"\n"+
											 "Genero: "+f.getGender()+"\n"+
											 "nacionalidad_Id: "+f.getNacionId()+"\n"+
											 "----------------------"+"\n");
					}
				}
			}
		});
		
		

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPanel.appendText("Hello\n");
			}
		});

		formPanel.setFormListener(new FormListener(){
			public void formEventOcurred(FormEvent e){

				lista.add(e);
				if(dbl.isConnected()){
					String sql = "INSERT INTO trabajador"+
								"(tipoEmpleado_Id,nombre,ocupacion_Id,edad,genero,nacionalidad_Id)"+
								"VALUES ("+e.getEmpTipo()+",'"+e.getName()+"',"+e.getOccupation()+","+30+
										  ",'"+e.getGender()+"',"+e.getNacionId()+")";	
					System.out.println(sql);
					dbl.queryExec(sql);
				}
				else{
					System.out.println("Conexion no establecida");
				}
			}
		});
		
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		add(formPanel,BorderLayout.WEST);
		
		
		setSize(700, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

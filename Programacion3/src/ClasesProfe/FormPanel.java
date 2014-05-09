package ClasesProfe;

import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FormPanel extends JPanel implements ActionListener {
	
	private JLabel nameLabel;
	private JLabel occupationLabel;
	private JLabel nacLabel;
	private JLabel modLabel;
	
	private JTextField nameField;
	private JTextField occupationField;
	private JTextField nacField;
	private JTextField modField;
	
	DatabaseLayer dbl = new DatabaseLayer();


	private JButton okBtn;
	private JButton actButton;
	private JButton delButton;
	
	private JList ageList;
	private JComboBox empCombo;
	private JComboBox nacCombo;
	private JComboBox tipoCombo;
	private JComboBox ocuCombo;
	
	
	private JCheckBox cbMexicano;
	private JCheckBox modCheck;
	
	private JRadioButton maleRadio;
	private JRadioButton femaleRadio;
	private JRadioButton otherRadio;
	private ButtonGroup genderGroup;	
	
	private FormListener formListener;
	
	public FormPanel (){
		Dimension dim = getPreferredSize();
		dim.width = 250;
		setPreferredSize(dim);
		
		nameLabel = new JLabel("Nombre: ");
		occupationLabel = new JLabel ("Edad: ");
		nacLabel = new JLabel("Nacionalidad: ");
		modLabel = new JLabel("ID del campo a modificar");

		nameField = new JTextField(10);
		occupationField = new JTextField(10);
		nacField = new JTextField(10);
		modField = new JTextField(5);
		modField.setEnabled(false);
		
		empCombo = new JComboBox();
		nacCombo = new JComboBox();
		tipoCombo = new JComboBox();
		ocuCombo = new JComboBox();
		
		cbMexicano = new JCheckBox("Mexicano",false);
		modCheck = new JCheckBox("Modificar por ID",false);
		
		maleRadio = new JRadioButton("Masculino");
		maleRadio.setActionCommand("Masculino");
		femaleRadio = new JRadioButton("Femenino");
		femaleRadio.setActionCommand("Femenino");
		otherRadio = new JRadioButton("Otro");
		otherRadio.setActionCommand("Gaaaaay");
		
		genderGroup = new ButtonGroup();
		maleRadio.setSelected(true);
		genderGroup.add(maleRadio);
		genderGroup.add(femaleRadio);
		genderGroup.add(otherRadio);		
		
		
		ageList=new JList();
		DefaultListModel ageModel = new DefaultListModel();
		ageModel.addElement(new AgeCategory(23,"18 - 35"));
		ageModel.addElement(new AgeCategory(34,"36 - 55"));
		ageModel.addElement(new AgeCategory(45,"Mas de 56"));
		ageList.setModel(ageModel);

		ageList.setPreferredSize(new Dimension(110,70));
		ageList.setBorder(BorderFactory.createEtchedBorder());
		ageList.setSelectedIndex(0);
		
		///// Nacionalidad ComboBox////////////////

		String sql = "select * from nacionalidad";
		ArrayList<Nacionalidad> nacList = dbl.resultQueryNac(sql);
		
		DefaultComboBoxModel nacModel = new DefaultComboBoxModel();
		for(Nacionalidad f:nacList){
			nacModel.addElement(new Nacionalidad(f.getId(),f.getNacionalidad()));			
		}
		nacCombo.setModel(nacModel);
		nacCombo.setSelectedIndex(0);
		
		///// Tipo Empleado ComboBox////////////////
		sql = "select * from tipoempleado";
		ArrayList<Empleado> tipoList = dbl.resultQueryType(sql);
		
		DefaultComboBoxModel typeModel = new DefaultComboBoxModel();
		for(Empleado f:tipoList){
			typeModel.addElement(new Empleado(f.getId(),f.getTipoEmpleado()));			
		}
		tipoCombo.setModel(typeModel);
		tipoCombo.setSelectedIndex(0);
		
		/////Ocupacion ComboBox/////////////////////
		 sql = "select * from ocupacion";
		ArrayList<Ocupacion> ocuList = dbl.resultQueryOcup(sql);
		
		DefaultComboBoxModel ocuModel = new DefaultComboBoxModel();
		for(Ocupacion f:ocuList){
			ocuModel.addElement(new Ocupacion(f.getId(),f.getOcupacion()));			
		}
		ocuCombo.setModel(ocuModel);
		ocuCombo.setSelectedIndex(0);
		
		cbMexicano.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (cbMexicano.isSelected()){
					nacField.setEnabled(false);
				}
				else{
					nacField.setEnabled(true);
				}
			}
			
		});
		
		modCheck.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (modCheck.isSelected()){
					modField.setEnabled(true);
					actButton.setEnabled(true);
					delButton.setEnabled(true);
				}
				else{
					modField.setEnabled(false);
					actButton.setEnabled(false);
					delButton.setEnabled(false);
				}
			}
			
		});
		
		delButton = new JButton("Borrar");
		delButton.setEnabled(false);
		delButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String sql = "delete from trabajador where idTrabajador="+modField.getText();
				dbl.delQuery(sql);
			}
			
		});
		actButton = new JButton("Actualizar");
		actButton.setEnabled(false);
		actButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nameField.getText();
				int occupation = ocuCombo.getSelectedIndex()+1;
				AgeCategory ageCat = (AgeCategory)ageList.getSelectedValue();
				int edad = Integer.parseInt(occupationField.getText());
				int empTipo = tipoCombo.getSelectedIndex()+1;
				String gender = genderGroup.getSelection().getActionCommand();
				System.out.println(gender);
				
				FormEvent ev = new FormEvent(this,name,occupation,edad,empTipo,gender,nacCombo.getSelectedIndex()+1);
				
				String indice = modField.getText();
				dbl.actQuery(ev,indice);

				}
			
			
		});

		
		okBtn = new JButton("OK");
		okBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e){
				String name = nameField.getText();
				int occupation = ocuCombo.getSelectedIndex()+1;
				int edad = Integer.parseInt(occupationField.getText());
				int empId= 0;
				int empTipo = tipoCombo.getSelectedIndex()+1;
				String gender = genderGroup.getSelection().getActionCommand();
				int naci =nacCombo.getSelectedIndex();
				
				FormEvent ev = new FormEvent(this,name,occupation,edad,empId,empTipo,gender,naci+1);

				
				if(formListener != null){
					formListener.formEventOcurred(ev);
				}
			}
		});
		
		Border innerBorder = BorderFactory.createTitledBorder("Agregar Persona");
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		
		//////////////////////First ROW////////////////////////////////
		
		gc.weightx =1;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0,0,0,5);
		add(nameLabel,gc);
		
		gc.gridx = 1;
		gc.gridy = 0;
		gc.insets = new Insets(0,0,0,0);
		gc.anchor = GridBagConstraints.LAST_LINE_START;
		add(nameField,gc);		
		////////////////Second ROW///////////////////////////////
		
		gc.weightx =1;
		gc.weighty =0.1;
		
		gc.gridy = 1;
		gc.gridx = 0;
		gc.insets = new Insets(0,0,0,5);
		gc.anchor = GridBagConstraints.LINE_END;
		add(occupationLabel,gc);
		
		gc.gridy = 1;
		gc.gridx = 1;
		gc.insets = new Insets(0,0,0,0);
		gc.anchor = GridBagConstraints.LINE_START;
		add(occupationField,gc);		
		///////////////Third ROW/////////////////////
		
		gc.weightx = 1;
		gc.weighty = 0.2;
		
		gc.gridy = 2;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(ocuCombo,gc);	
		
		gc.gridy=5;
		gc.gridx=1;
		add(okBtn,gc);

		/////////////////Fourth ROW//////////////////
		
		gc.weightx = 1;
		gc.weighty = 0.3;
		
		gc.gridy = 2;
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(tipoCombo,gc);		
		////////////////Fifth ROW//////////////////////
		
		gc.weightx = 1;
		gc.weighty = 0.5;
		
		gc.gridy = 6;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(modField,gc);
		//gc.gridy++;
		//add(okBtn,gc);

		
		////////////////Sixth ROW///////////////////////
		gc.weightx = 1;
		gc.weighty = 0.2;
		
		gc.gridy = 3;
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(maleRadio,gc);
		gc.gridy++;
		add(femaleRadio,gc);
		gc.gridy++;
		add(otherRadio,gc);
		gc.gridy++;
		add(modCheck,gc);
		gc.gridy=7;
		add(delButton,gc);
		gc.gridx++;
		add(actButton,gc);
		
		////////////////Seventh ROW/////////////////////
		gc.weightx = 1;
		gc.weighty = 0.2;
		
		gc.gridy = 3;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(nacCombo,gc);

		
		
		/////////////////
		}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
	
	public void setFormListener(FormListener Listener){
		this.formListener=Listener;
		
	}
	
	public void setTextListener(FormListener Listener){
		this.formListener=Listener;
	}	
}

////////////////////////////ClasesInterna////////////////////////////////////////////
class AgeCategory{
	private int id;
	private String text;
	
	public AgeCategory(int id, String text){
		this.id=id;
		this.text=text;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String toString(){
		return text;
	}	
}

class EmployeeCategory{
	private int id;
	private String text;
	
	EmployeeCategory (int id, String text){
		this.id=id;
		this.text=text;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String toString(){
		return text;
	}	
}









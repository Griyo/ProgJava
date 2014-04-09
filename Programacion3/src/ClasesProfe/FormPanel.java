package ClasesProfe;

import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	private JTextField nameField;
	private JTextField occupationField;
	private JTextField nacField;

	private JButton okBtn;
	private JList ageList;
	private JComboBox empCombo;
	
	
	private JCheckBox cbMexicano;
	
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
		occupationLabel = new JLabel ("Ocupacion: ");
		nacLabel = new JLabel("Nacionalidad: ");

		nameField = new JTextField(10);
		occupationField = new JTextField(10);
		nacField = new JTextField(10);
		empCombo = new JComboBox();
		cbMexicano = new JCheckBox("Mexicano",false);
		
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
		
		DefaultComboBoxModel empModel = new DefaultComboBoxModel();
		empModel.addElement(new EmployeeCategory(0,"Empleado"));
		empModel.addElement(new EmployeeCategory(1,"Por Contrato"));
		empModel.addElement(new EmployeeCategory(2,"No Empleado"));
		empCombo.setModel(empModel);
		empCombo.setSelectedIndex(0);
		
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
		
		okBtn = new JButton("OK");
		okBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e){
				String name = nameField.getText();
				String occupation = occupationField.getText();
				AgeCategory ageCat = (AgeCategory)ageList.getSelectedValue();
				int edad = ageCat.getId();
				String rango = ageCat.getText();
				EmployeeCategory empCat = (EmployeeCategory)empCombo.getSelectedItem();
				int empId=(empCat.getId());
				String empTipo = empCat.getText();
				String gender = genderGroup.getSelection().getActionCommand();
				System.out.println(gender);
				String nacionalidad;
				if(cbMexicano.isSelected()){
					nacionalidad="Mexican@";
				}
				else{
					nacionalidad=nacField.getText();
				}
				
				FormEvent ev = new FormEvent(this,name,occupation,edad,empId,rango,empTipo,gender,nacionalidad);
				
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
		add(ageList,gc);		
		/////////////////Fourth ROW//////////////////
		
		gc.weightx = 1;
		gc.weighty = 0.3;
		
		gc.gridy = 2;
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(empCombo,gc);		
		////////////////Fifth ROW//////////////////////
		
		gc.weightx = 1;
		gc.weighty = 0.5;
		
		gc.gridy = 6;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(okBtn,gc);
		
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
		
		////////////////Seventh ROW/////////////////////
		gc.weightx = 1;
		gc.weighty = 0.2;
		
		gc.gridy = 3;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(cbMexicano,gc);
		gc.weightx = 1;
		gc.weighty = 0.5;
		
		gc.weightx = 1;
		gc.weighty = 0.2;
		
		gc.gridy = 5;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(nacField,gc);
		
		gc.weightx = 1;
		gc.weighty = 0.2;
		
		gc.gridy = 4;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(nacLabel,gc);
		
		
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






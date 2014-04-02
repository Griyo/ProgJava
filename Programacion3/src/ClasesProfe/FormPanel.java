package ClasesProfe;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FormPanel extends JPanel implements ActionListener {
	
	private JLabel nameLabel;
	private JLabel occupationLabel;
	private JTextField nameField;
	private JTextField occupationField;
	private JButton okBtn;
	private JList ageList;
	
	private FormListener formListener;

	
	public FormPanel (){
		Dimension dim = getPreferredSize();
		dim.width = 250;
		setPreferredSize(dim);
		
		nameLabel = new JLabel("Nombre: ");
		occupationLabel = new JLabel ("Ocupacion: ");
		nameField = new JTextField(10);
		occupationField = new JTextField(10);
		
		ageList=new JList();
		DefaultListModel ageModel = new DefaultListModel();
		ageModel.addElement(new AgeCategory(23,"18 - 35"));
		ageModel.addElement(new AgeCategory(34,"36 - 55"));
		ageModel.addElement(new AgeCategory(45,"Mas de 56"));
		ageList.setModel(ageModel);
		
		ageList.setPreferredSize(new Dimension(110,70));
		ageList.setBorder(BorderFactory.createEtchedBorder());
		ageList.setSelectedIndex(0);
		
		okBtn = new JButton("OK");
		okBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e){
				String name = nameField.getText();
				String occupation = occupationField.getText();
				AgeCategory ageCat = (AgeCategory)ageList.getSelectedValue();
				int edad = ageCat.getId();
				
				FormEvent ev = new FormEvent(this,name,occupation,edad);
				
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
		gc.weighty = 2.0;
		
		gc.gridy = 3;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(okBtn,gc);	
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


////////////////////////////ClaseInterna////////////////////////////////////////////
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






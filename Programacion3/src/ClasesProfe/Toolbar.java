package ClasesProfe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Toolbar extends JPanel implements ActionListener {
	private JButton helloButton;
	private JButton goodbyeButton;
	
	//private TextPanel textPanel;
	private StringListener textListener;
	
	public Toolbar() {
		helloButton = new JButton("Hello");
		goodbyeButton = new JButton("Goodbye");
		
		helloButton.addActionListener(this);
		goodbyeButton.addActionListener(this);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloButton);
		add(goodbyeButton);
	}

	/*public void setTextPanel (TextPanel textPanel){
		this.textPanel = textPanel;
	}*/
	
	public void setStringListener(StringListener Listener){
		this.textListener = Listener;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton clicked =  (JButton) arg0.getSource();
		if(clicked == helloButton){
			//textPanel.appendText("Hello!\n");
			if (textListener != null){
				textListener.textEmitted("Hello\n");
			}
		}
		else {
			//textPanel.appendText("Goodbye!\n");
			if (textListener != null){
				textListener.textEmitted("Goodbye\n");
			}
			}
	}
}

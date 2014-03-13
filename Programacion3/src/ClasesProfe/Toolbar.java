package ClasesProfe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
	private JButton goodbyeButton;	
	private StringListener textListener;
	
	public Toolbar() {
		goodbyeButton = new JButton("Goodbye");
		
		goodbyeButton.addActionListener(this);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(goodbyeButton);
	}
	
	public void setStringListener(StringListener Listener){
		this.textListener = Listener;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clicked =  (JButton) e.getSource();
		if(clicked == goodbyeButton){
			if (textListener != null){
				textListener.textEmitted("Hello!\n");
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




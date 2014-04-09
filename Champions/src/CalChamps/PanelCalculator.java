package CalChamps;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.print.DocFlavor.URL;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelCalculator extends JPanel {
	
	float hp,hpReg,mana,manaReg,attackDamage,attackSpeed,armor,magicResistance,movementSpeed,range;
	float hp5,hpReg5,mana5,manaReg5,attackDamage5,ataackSpeed5,armor5,magicResistance5;
	Image backImage = new ImageIcon("BackGrounds/Aatrox_Splash_0.jpg").getImage();
    
	public PanelCalculator(){	
		Dimension dim = getPreferredSize();
		dim.width = 250;
		setPreferredSize(dim);
		
		Border innerBorder = BorderFactory.createTitledBorder("Stats Calculator");
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
	}
}

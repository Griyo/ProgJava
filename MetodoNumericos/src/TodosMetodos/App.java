package TodosMetodos;

import javax.swing.SwingUtilities;

import TodosMetodos.MainFrame;

public class App {
		public static void main(String[] args) {
			
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					new MainFrame();
					}
			});	
		}
}

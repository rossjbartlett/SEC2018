import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class InputController {
	private InputGUI inputGUI;
	
	public InputController(InputGUI GUI) {
		inputGUI = GUI;
		GUI.setButtonListener(new LoginButtonListener());
	}
	
	
	class LoginButtonListener implements ActionListener {
		

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(validInputs()) {
				//run logic 
				
				String filename = inputGUI.getFileNameInput();
				File f = new File(filename);
				if(!f.exists() || f.isDirectory()) { 
				    // error
					System.err.println("Error opening file!");
					JOptionPane.showMessageDialog(null, "Error: Couldn't find file", "Error",
							JOptionPane.WARNING_MESSAGE);
					inputGUI.clearFields();
					return;
				}
				Demo d = new Demo(filename);
				d.runDemo();
				//display output
				
				OutputGUIPanel [] panels = new OutputGUIPanel[3];
				for(int i = 0; i < 3; i++) {
					panels[i] = new OutputGUIPanel(i, d.routes[i]); // routeNumber, route
				}
				
				OutputGUI outGUI = new OutputGUI(d.expenseCost, panels[0], panels[1], panels[2]);
				
				
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Error: Invalid inputs, please try again", "Error",
						JOptionPane.WARNING_MESSAGE);
				inputGUI.clearFields();
			}

		}

		private boolean validInputs() {
			try {
				Bus.setTicketCost(Float.parseFloat(inputGUI.getCostInput()));
				Bus.setCapacity(Integer.parseInt(inputGUI.getCapacityInput()));
			}catch(NumberFormatException e) {
				return false;
			}
			return true;
		}
		
		
	}//end of inner class LoginButtonListener
	

}

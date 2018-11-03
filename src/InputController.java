import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
				
				
				
				//display output
				
				
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

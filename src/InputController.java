import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class InputController {
	private InputGUI inputGUI;
	
	public InputController(InputGUI GUI) {
		inputGUI = GUI;
		GUI.setButtonListener(new LoginButtonListener());
	}
	
	
	class LoginButtonListener implements ActionListener {
		

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println(inputGUI.getCostInput());
			System.out.println(inputGUI.getCapacityInput());
			System.out.println(inputGUI.getFileNameInput());
		}
		
		
	}//end of inner class LoginButtonListener

}

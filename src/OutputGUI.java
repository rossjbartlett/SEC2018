import java.awt.FlowLayout;

import javax.swing.JFrame;

public class OutputGUI extends JFrame{

	public OutputGUI(OutputGUIPanel panel1, OutputGUIPanel panel2, OutputGUIPanel panel3) {
		setLayout(new FlowLayout());
		add(panel1);
		add(panel2);
		add(panel3);
		pack();
		setVisible(true);    
	}

}

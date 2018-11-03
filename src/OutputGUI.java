import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class OutputGUI extends JFrame{
	private JLabel costJLabel = new JLabel();

	public OutputGUI(float cost, OutputGUIPanel panel1, OutputGUIPanel panel2, OutputGUIPanel panel3) {
		setLayout(new FlowLayout());
		setTitle("City of Algary Routes");
		add(panel1);
		add(panel2);
		add(panel3);
		
		costJLabel.setText("Net Profit: $"+cost*-1);
		costJLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(costJLabel);
		
		pack();
		setVisible(true);    
	}

}

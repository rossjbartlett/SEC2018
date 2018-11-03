import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class InputGUI extends JFrame{

    private JButton runButton = new JButton("RunApplication");
    
    private JTextField costField = new JTextField(20);
    private JTextField capacityField = new JTextField(20);
    private JTextField fileNameField = new JTextField(20);

	public InputGUI() {
		setTitle("City of Algary bus routing application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
		setPreferredSize(new Dimension(400,250));

        fillContentPane();

        pack();
        setLocationRelativeTo(null); // center the JFrame
		setResizable(false);
		setVisible(true);
	}
	
	private void fillContentPane() {
		costField.setMaximumSize( costField.getPreferredSize() );
		capacityField.setMaximumSize( capacityField.getPreferredSize() );
		fileNameField.setMaximumSize( fileNameField.getPreferredSize() );
        runButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(Box.createRigidArea(new Dimension(0,10))); //empty spacing 
        add(GuiUtilities.centeredJLabel("Welcome! Please enter your login information."));
        add(Box.createRigidArea(new Dimension(0,10))); //empty spacing 
        add(GuiUtilities.centeredJLabel("Cost:"));
        add(costField);
        add(GuiUtilities.centeredJLabel("Capacity:"));
        add(capacityField);
        add(GuiUtilities.centeredJLabel("Text Field:"));
        add(fileNameField);
        add(Box.createRigidArea(new Dimension(0,10))); //empty spacing 
        add(runButton);
    }
	

	public void setButtonListener(ActionListener e) {
		runButton.addActionListener(e);
	}
	

	public void clearFields(){
		costField.setText("");	
		capacityField.setText("");	
		fileNameField.setText("");
    }

    public String getCostInput(){
        return costField.getText();
    }

    public String getCapacityInput(){
        return capacityField.getText();
    }

    public String getFileNameInput(){
        return fileNameField.getText();
    }
    
}
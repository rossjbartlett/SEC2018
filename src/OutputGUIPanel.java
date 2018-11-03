

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

@SuppressWarnings("serial")
public class OutputGUIPanel extends JPanel{

	BusRoute route;
	int routeNum;
	private JLabel routeTitleJLabel = new JLabel();
	private JLabel deployedBusesJLabel = new JLabel();
	private JLabel commuteTimeJLabel = new JLabel();
	private JLabel routeCostJLabel = new JLabel();
	private JLabel totalStopsJLabel = new JLabel();

	
	DefaultListModel<BusStop> routeListModel = new DefaultListModel<>(); 
	JList<BusStop> routeJList;

	public OutputGUIPanel(int routeNumber, BusRoute route) {
		setLayout( new BoxLayout(this, BoxLayout.PAGE_AXIS));
//		setPreferredSize(new Dimension(800,600));
		this.route = route;
		this.routeNum = routeNumber;
		fillContentPane();
		
	}
	

	/**
	 * Helper method to add components to the panel
	 */
	private void fillContentPane() {
		//add(Box.createRigidArea(new Dimension(0,10))); //empty spacing 
		
		makeJLabel(routeTitleJLabel,"Route "+routeNum);

		//add(GuiUtilities.centeredJLabel("Routes"));
		addRoutesList();
		
		makeJLabel(deployedBusesJLabel,"Deployed Buses: "+route.numBuses);
		makeJLabel(totalStopsJLabel,"Stops: "+route.stops);

		makeJLabel(commuteTimeJLabel,"Commute Time: "+route.pathLength+ "min");
		makeJLabel(routeCostJLabel,"Cost: $"+route.getRouteCost());


	}
	
	private void makeJLabel(JLabel label, String s) {
		label.setText(s);
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(label);
	}
	
	/**
	 * Helper method to add components to the results panel
	 */
	private void addRoutesList() {
		
		routeListModel = new DefaultListModel<>();
		for(BusStop stop : route.getStops()) {
			routeListModel.addElement(stop);
		}

		
		routeJList = new JList<>(routeListModel);//updates the resultsList to show all database contents
		routeJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		routeJList.setLayoutOrientation(JList.VERTICAL);
		
		routeJList.setModel(routeListModel);

	
		JScrollPane scroller = new JScrollPane(routeJList);
		scroller.setMaximumSize(new Dimension(400,600));
		add(scroller);

	}
	
	

}

package _02_array_list_guestbook;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import _01_array_list_visualizer.data.ArrayList;

public class GuestBook implements ActionListener {
	public void setup(){
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();

		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		button.setText("Add Name");
		button2.setText("View Names");
		button.addActionListener(this);
		button2.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
		}
	JButton button=new JButton();
	JButton button2=new JButton();
	public static void main(String[] args) {
		GuestBook GuestBook=new GuestBook();
		GuestBook.setup();
	}
	ArrayList<String> list = new ArrayList<String>();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
			String name=JOptionPane.showInputDialog("Enter a name.");
			list.add(name);

		}
		if (e.getSource()==button2) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			JOptionPane.showMessageDialog(null, list.get(i));
			}
		}
	}

	
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}

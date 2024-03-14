package com.eva.todoapp.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class WindowDisplay extends JFrame{
	
	public static void main(String[] args) {
		
		new WindowDisplay();
		
	}
	
	public WindowDisplay() {
		
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); 
		this.setTitle("Todo List");
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		
		int xPos = (dim.width/2) - (this.getWidth()/2);
		int yPos = (dim.height/2) - (this.getHeight()/2);
		this.setLocation(xPos, yPos);
		
		// Panel object and content declaration
		JPanel thePanel = new JPanel();
		JLabel label1 = new JLabel("Insert Label here");
		JButton addTaskButton = new JButton("Add Task");
		JTextField newTextField = new JTextField("Type Here", 15);
		
		
		label1.setText("New Text");
		label1.setToolTipText("Doesn't do anything");
		
		newTextField.setToolTipText("Enter a task you wish to complete");
		
		// Updates the contents of the panel
		thePanel.add(label1);
		thePanel.add(addTaskButton);
		thePanel.add(newTextField);
		
		// Add the contents of the panel to the frame
		this.add(thePanel); 
		
		this.setVisible(true);
		
	}

}

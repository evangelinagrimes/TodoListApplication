package com.eva.todoapp.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

import java.awt.event.*;
import java.util.ArrayList;

/**
 * The 
 */
public class WindowDisplay extends JFrame{
	
	JPanel mainPanel = new JPanel();
	ArrayList<JCheckBox> checkboxList;
	JFrame theFrame;
	
	public static void main(String[] args) {
		
		new WindowDisplay().buildGUI();
		
	}
	// The constructor file
	public void buildGUI() {
		
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true); 
		this.setTitle("Todo List");
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		
		int xPos = (dim.width/2) - (this.getWidth()/2);
		int yPos = (dim.height/2) - (this.getHeight()/2);
		this.setLocation(xPos, yPos);
		
		JPanel panelA = new JPanel();
		
		
		panelA.add(new JButton("Button 1"));
		panelA.add(new JButton("Button 2"));
		panelA.add(new JButton("Button 2"));
		
		this.add(panelA);
		
		this.setVisible(true);
		
	}

}

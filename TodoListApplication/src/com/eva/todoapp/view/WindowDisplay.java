package com.eva.todoapp.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.eva.todoapp.model.TodoItem;


public class WindowDisplay implements ActionListener{
    private JFrame frame;
    private JList<TodoItem> todoList;
    private static DefaultListModel<TodoItem> listModel;

    public WindowDisplay(){
        frame = new JFrame("To-Do List");
        listModel = new DefaultListModel<>();
        todoList = new JList<>(listModel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create JPanels
        JPanel mainPanel = new JPanel();
        JPanel toolbarPanel = new JPanel();

        // Configure Layout for each JPanel
        mainPanel.setLayout(new BorderLayout());
        toolbarPanel.setLayout(new FlowLayout());
     
        // Add Components to JPanels
        mainPanel.add(new JLabel("Main Content"), BorderLayout.CENTER);
        toolbarPanel.add(new JButton("Button 1"));
        toolbarPanel.add(new JButton("Button 2"));

        frame.add(new JScrollPane(todoList));
       
        frame.setVisible(true);
    }

    // Methods to interact with the view
    public void addTask(TodoItem taskDescription) {
        listModel.addElement(taskDescription);
    }
    
    public void clearTasks() {
        listModel.clear();
    }
    
    // Other methods as needed
   
	public static void main(String[] args) {
		
		TodoItem testItem = new TodoItem("Wash Dishes");
		listModel.addElement(testItem);
		WindowDisplay view = new WindowDisplay();
		
	}
} 


/*
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
*/

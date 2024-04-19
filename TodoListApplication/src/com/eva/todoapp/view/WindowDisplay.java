package com.eva.todoapp.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import com.eva.todoapp.model.TodoItem;


public class WindowDisplay implements ActionListener{
    private JFrame frame;
    private JList<TodoItem> todoList;
    private ArrayList<TodoItem> itemList;

    public WindowDisplay(){
        frame = new JFrame("To-Do List");
        itemList = new ArrayList<>();
        todoList = new JList<TodoItem>();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create JPanels
        JPanel mainPanel = new JPanel();
        JPanel toolbarPanel = new JPanel();
        
        // Configure Layout for each JPanel
        mainPanel.setLayout(new BorderLayout());
        toolbarPanel.setLayout(new FlowLayout());
     
        
        // Add Buttons to Content Page
        JButton isCompleted = new JButton("Completed");
        final JTextField tf=new JTextField();  
        tf.setBounds(50,50, 150,20);  
        JButton addTaskBt = new JButton("Add Task");
        addTaskBt.setBounds(50,100,95,30);  
        addTaskBt.addActionListener(new ActionListener(this));  
        
        
        // Add Components to JPanels
        mainPanel.setBackground(Color.BLUE);
        mainPanel.add(new JLabel("This is the Main Content of the program -- How far"
        		+ "will these words reach. I am going to keep typing"), BorderLayout.NORTH);
        toolbarPanel.add(addTaskBt);
        //toolbarPanel.add(new JButton("Add Task"));

        // Add JPanels to Frame
        frame.add(new JScrollPane(todoList));
        frame.add(toolbarPanel);
        frame.add(mainPanel, BorderLayout.CENTER);
        
        frame.setVisible(true);
    }

    // Methods to interact with the view
    public void addTask(TodoItem taskDescription) {
        itemList.add(taskDescription);
    }
    
    public void clearTasks() {
        itemList.clear();
    }
    
    public String toString() {
    	String bigString = "";
    	for(TodoItem item: itemList) {
    		bigString.concat(item.getTask()+ "\n");
    	}
    	return bigString;
    }
    
    @Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
    // Other methods as needed
    // Question: Is this where I should have these methods? Would it be better to put in controller?
	public static void main(String[] args) {
		
		WindowDisplay view = new WindowDisplay();
		TodoItem testItem = new TodoItem("Wash Dishes");
		view.addTask(testItem);
		
		
	}
} 
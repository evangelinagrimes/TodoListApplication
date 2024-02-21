package com.eva.todoapp.model;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

import java.time.*;

/**
 * Add tasks, remove tasks, edit tasks, view tasks, marking tasks (complete/incomplete), 
 * add deadlines, remove deadlines, edit deadlines, view deadlines
 */

public class TodoItem {
	private String task;
	private boolean isComplete;
	private LocalDate deadline;
	private LocalDate currentDate;
	private JSONObject json;
	
	public TodoItem(String taskTitle) {
		this.task = taskTitle;
		this.currentDate = LocalDate.now();
		this.isComplete = false;
	}
	public TodoItem() {
		json = new JSONObject();
		json.put("Value1", "Value2");
	};
	
	/**
	 * @return Returns the task
	 */
	public String getTask() {
		return this.task;
	}
	/**
	 * @param newTask
	 */
	public void setTask(String newTask) {
		this.task = newTask;
	}
	public void setDeadline(int dayRequirement) {
		this.deadline = LocalDate.now().plusDays(dayRequirement);
	}
	public LocalDate getDeadline() {
		return this.deadline;
	}
	
	/**
	 * @param 
	 * 
	 * @return This method adds a TodoItem object to the ArrayList, todoList
	 */
	public void addTask(TodoItem task) {
		// To be completed
	}
	
	/**
	 * @param 
	 * 
	 * @return This method iterates through the todoList List and pinpoints 
	 * the index of the object in the parameter. Then it removes the
	 * object from the list.
	 */
	public void removeTask(TodoItem task) {
		// To be completed
	}
	
	/**
	 * @param task
	 * @Description This method iterates through the todoList List and pinpoints
	 * the index of the object in the parameter. Then it edits the task 
	 */
	public void editTask(TodoItem task, String newTask) {
		// To be completed
	}
	
	/**
	 * @void this method
	 */
	public void viewTasks() {
		// To be completed
	}
	
	/**
	 * @return This method sets isComplete to true
	 */
	public void markCompleted() {
		this.isComplete = true;
	}
	
	/**
	 * @return This method sets isComplete to false
	 */
	public void markIncomplete() {
		this.isComplete = false;
	}
	
	public void changeDeadline() {
		// To be completed
	}
	
	public void removeDeadline() {
		// To be completed
	}
	
	public static void main(String[] args) {
		new TodoItem();
	}
}


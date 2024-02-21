import java.util.ArrayList;
import java.util.List;
import java.time.*;
/**
 * Add tasks, remove tasks, edit tasks, view tasks, marking tasks (complete/incomplete), 
 * add deadlines, remove deadlines, edit deadlines, view deadlines
 */
public class TodoItem {
	private String task;
	private String status;
	private LocalDate deadline;
	private LocalDate currentDate;
	private List<TodoItem> todoList = new ArrayList();
	
	public TodoItem(String taskTitle) {
		this.task = taskTitle;
		this.currentDate = LocalDate.now();
		this.status = "Incomplete";
	}
	public TodoItem() {
		
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
	public String toString() {
		return "Length of Todo List is " + todoList.size();
	}
	
	/**
	 * @param 
	 * 
	 * @return This method adds a TodoItem object to the ArrayList, todoList
	 */
	public void addTask(TodoItem task) {
		todoList.add(task);
	}
	
	/**
	 * @param 
	 * 
	 * @return This method iterates through the todoList List and pinpoints 
	 * the index of the object in the parameter. Then it removes the
	 * object from the list.
	 */
	public void removeTask(TodoItem task) {
		String checkName = task.getTask();
		int index = 0;
		
		for(TodoItem todo: todoList) {
			if(todo.getTask().equals(checkName))
				break;
			else
				index++;
		}
		todoList.remove(index);
	}
	
	/**
	 * @param task
	 * @Description This method iterates through the todoList List and pinpoints
	 * the index of the object in the parameter. Then it edits the task 
	 */
	public void editTask(TodoItem task, String newTask) {
		String checkName = task.getTask();
		int index = 0;
		
		for(TodoItem todo: todoList) {
			if(todo.getTask().equals(checkName))
				break;
			else
				index++;
		}
		todoList.get(index).setTask(newTask);
	}
	
	/**
	 * @void this method
	 */
	public void viewTasks() {
		// To be completed
	}
	
	/**
	 * @return This method changes the current status to "Completed"
	 */
	public void markCompleted() {
		this.status = "Completed";
	}
	
	/**
	 * @return This method changes the current status to "Incomplete"
	 */
	public void markIncomplete() {
		this.status = "Incomplete";
	}
	
	public void changeDeadline() {
		// To be completed
	}
	
	public void removeDeadline() {
		// To be completed
	}
	
}


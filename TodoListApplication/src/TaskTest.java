import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Add tasks
 * Remove tasks
 * Edit tasks 
 * View tasks
 * Marking tasks (complete/incomplete) 
 * Add deadlines 
 * Remove deadlines 
 * Edit deadlines 
 * View deadlines
 */

class TaskTest {
	private List<TodoItem> goodList = new ArrayList<TodoItem>();
	private List<TodoItem> badList = new ArrayList<TodoItem>();
	
	@BeforeEach
	void setUp() {
		goodList.add(new TodoItem("Finish Lab"));
		goodList.add(new TodoItem("Finish Matrix Homework"));
		goodList.add(new TodoItem("Feed the cat"));
		goodList.add(new TodoItem("Clean your room"));
		goodList.add(new TodoItem("Wash your laundry"));
		
		badList.add(new TodoItem("Go Surfing"));
		badList.add(new TodoItem(null));
		badList.add(new TodoItem("Get Groceries"));
		badList.add(new TodoItem("Water Plants"));
		badList.add(new TodoItem(""));
		badList.add(new TodoItem("Buy Barbies"));
	}
	
	@AfterEach
	void tearDown() {
		badList = null;
		goodList = null;
	}
	
	
	/**
	 * Tests if items were successfully added to the list
	 */
	@Test
	void testAddTaskToGoodList() {
		var item1 = new TodoItem("Go to sleep on time");
		
		List<TodoItem> expected = new ArrayList<TodoItem>();
		
		expected.add(new TodoItem("Go surfing"));
		expected.add(new TodoItem(null));
		expected.add(new TodoItem("Get Groceries"));
		expected.add(new TodoItem("Water Plants"));
		expected.add(new TodoItem(""));
		expected.add(new TodoItem("Buy Barbies"));
		expected.add(new TodoItem("Go To Sleep On Time"));
		
		((TodoItem) goodList).addTask(item1);
		
		assertEquals(expected, badList);
		
	}
		

}

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
	private TodoItem[] goodList;
	private TodoItem[] badList;
	
	@BeforeEach
	void setUp() {
		@SuppressWarnings("unchecked")
		List<TodoItem> goodList = new ArrayList();
		goodList.add(new TodoItem("Finish Lab"));
		goodList.add(new TodoItem("Finish Matrix Homework"));
		goodList.add(new TodoItem("Feed the cat"));
		goodList.add(new TodoItem("Clean your room"));
		goodList.add(new TodoItem("Wash your laundry"));
		
		List<TodoItem> badList = new ArrayList();
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
	void testAddTaskToBadList() {
		var item1 = new TodoItem("Go to sleep on time");
		var expected = new TodoItem[] {new TodoItem("Go surfing"),
				new TodoItem(null),
				new TodoItem("Get groceries"),
				new TodoItem("Water plants"),
				new TodoItem(""),
				new TodoItem("Buy barbies"),
				new TodoItem("Go to sleep on time")
				};
		
		badList.add(item1);
		
		assertEquals(expected, null);
		
	}
		

}

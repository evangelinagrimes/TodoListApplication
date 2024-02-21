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
		goodList = new TodoItem[] {new TodoItem("Finish Lab"),
				new TodoItem("Finish Matrix Homework"),
				new TodoItem("Feed the cat"),
				new TodoItem("Clean your room"),
				new TodoItem("Wash your laundry")
		};
		badList = new TodoItem[] {new TodoItem("Go surfing"),
				new TodoItem(null),
				new TodoItem("Get groceries"),
				new TodoItem("Water plants"),
				new TodoItem(""),
				new TodoItem("Buy barbies")
		};
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

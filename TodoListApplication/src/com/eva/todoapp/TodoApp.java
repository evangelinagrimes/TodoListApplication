package com.eva.todoapp;
import java.util.ArrayList;
import java.util.List;

import com.eva.todoapp.model.TodoItem;

public class TodoApp {

	private List<TodoItem> todoList = new ArrayList<>();
	
	public static void main(String[] args) {
		
	int odd = intOdd(3);
	
	System.out.println(odd);
	}



public static int intOdd(int n) {
	
	if(n == 1) {
		return 1;
	}
	return (n + (n-1)) + intOdd(n-1);
}
}

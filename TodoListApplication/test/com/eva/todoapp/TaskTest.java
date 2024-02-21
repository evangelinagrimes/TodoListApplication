package com.eva.todoapp;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.eva.todoapp.model.TodoItem;

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
 * Point Reward System
 * 
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
}

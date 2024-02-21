package com.eva.todoapp.util;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * 
 */

public class Persistor {

	public static void main(String[] args) {
		new Persistor().readFile("data/test.json");
		
	}
	private void readFile(String filePath) {
		Object o;
		
		try {
			o = new JSONParser().parse(new FileReader(filePath));
			JSONObject j = (JSONObject) o;
			System.out.println(j);
			
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void writeFile(JSONObject entry, String filePath) {
		
	}
	

}

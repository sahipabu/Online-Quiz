package com.onlinequiz;

import java.io.*;
import java.util.ArrayList;

public class InterfaceHandler {
	
	ArrayList<InputQuestion> qList = new ArrayList<InputQuestion>();
	
	public static void main(String [] args){
		
		new InterfaceHandler().go();		
	}
	
	public void go(){
		populateQuiz();
	}

	public void populateQuiz(){
		Boolean more = true;
		DBOps db = new DBOps();
		while(more){
			
			InputQuestion ques = new InputQuestion();
			qList.add(ques);
			db.addToDB(ques);
			
			
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Do you want to add another question? ");
				String answer = br.readLine();
				System.out.println(answer);
				if(answer.equals("y") || answer.equals("Y"))
					more = true;
				else{
					more = false;
					System.out.println("false");
				}
					
				//read.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

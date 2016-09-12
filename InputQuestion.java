package com.onlinequiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputQuestion {
	protected String question = new String();
	protected String option1 = new String();
	protected String option2 = new String();
	protected String option3 = new String();
	protected String option4 = new String();
	protected String answer = new String();
	protected String subject = new String();
	protected String difficultyLevel = new String();		
	
	public String getQuestion() {
		return question;
	}

	public String getOption1() {
		return option1;
	}

	public String getOption2() {
		return option2;
	}

	public String getOption3() {
		return option3;
	}

	public String getOption4() {
		return option4;
	}

	public String getAnswer() {
		return answer;
	}

	public String getSubject() {
		return subject;
	}

	public String getDifficultyLevel() {
		return difficultyLevel;
	}

	public InputQuestion(){

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Please enter the Question: ");
			question = br.readLine();
			//System.out.println(question);
			
			System.out.print("Option1: ");
			option1 = br.readLine();
			//System.out.println(option1);
			
			System.out.print("Option2: ");
			option2 = br.readLine();
			//System.out.println(option2);
			
			System.out.print("Option3: ");
			option3 = br.readLine();
			//System.out.println(option3);
			
			System.out.print("Option4: ");
			option4 = br.readLine();
			//System.out.println(option4);
			
			System.out.print("Answer: ");
			answer = br.readLine();
			//System.out.println(answer);
			
			System.out.print("Subject: ");
			subject = br.readLine();
			//System.out.println(answer);
			
			System.out.print("Difficulty Level: ");
			difficultyLevel = br.readLine();
			//System.out.println(answer);
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}

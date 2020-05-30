package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String question = JOptionPane.showInputDialog("How many planets are there in our Solar System?");
		System.out.println(question);
				// 3.  Use an if statement to check if their answer is correct
		if(question.equals("8")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score ++;
		}
		else {
			score --;
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		question = JOptionPane.showInputDialog("Where did camels originate from?");
		System.out.println(question);
		if(question.equals("North America")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score ++;
		}
		else {
			score --;
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		System.out.println(score);
		
		
		}
		// After all the questions have been asked, tell the user their final score 
		
	}


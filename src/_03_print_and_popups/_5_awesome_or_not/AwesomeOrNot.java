package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
	public static void main(String[] args) {
	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
	int r = ran.nextInt(4);
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
	
		// 3. Print your variable to the console
	System.out.println(r);
		// 4. Get the user to enter something that they think is awesome
	String input = JOptionPane.showInputDialog("Enter Something that you think is AWESOME");
	System.out.println(input);
		// 5. If your variable is  0
	if(r == 0) {
	
			// -- tell the user whatever they entered is awesome!
		JOptionPane.showMessageDialog(null, "Your message is awesome!");
	}
		// 6. If your variable is  1
	if (r==1) {
	
			// -- tell the user whatever they entered is ok.
		JOptionPane.showMessageDialog(null, "That was ok");
	}
		// 7. If your variable is  2
	if (r==2) {
			// -- tell the user whatever they entered is boring.
		JOptionPane.showMessageDialog(null, "That was boring");
	}
		// 8. If your variable is  3
	if (r==3) {
			// -- invent your own message to give to the user (be nice).
		JOptionPane.showMessageDialog(null, "That made me fall asleep");
	}
}}

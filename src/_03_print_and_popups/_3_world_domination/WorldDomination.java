package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	


	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
	String question = JOptionPane.showInputDialog("Do you know how to write code?");
	System.out.println(question);
		// 2. If they say "yes", tell them they will rule the world.
		if(question.equals("yes")) {
			JOptionPane.showMessageDialog(null, "You will rule the world!");
		// 3. Otherwise, tell them to sign up for classes at The League.
		}
		else if (question.equals("no")) {
			JOptionPane.showMessageDialog(null, "Then learn some code.");
		}
	}
}


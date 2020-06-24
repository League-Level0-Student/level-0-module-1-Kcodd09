package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle = JOptionPane.showInputDialog("What is greater than God, more evil than the devil, the poor have it, the rich need it, and if you eat it, you will die?");
		System.out.println(riddle);
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(riddle.equals("nothing")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score+1;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer is nothing.");
			score = score-1;
		}
		// 6. Add some more riddles
		String riddle2 = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
		if(riddle2.equals("a stamp")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score+1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer is a stamp.");
			score = score-1;
		}
		String riddle3 = JOptionPane.showInputDialog("Who makes it, has no need of it. Who buys it, has no use for it. Who uses it can neither see nor feel it. What is it?");
		if(riddle3.equals("a coffin")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score+1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer is a coffin.");
			score = score-1;
		}
		
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Finished! Your end score is "+score);
	
}
}

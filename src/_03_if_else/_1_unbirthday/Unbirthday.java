package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		
String input = JOptionPane.showInputDialog(null, "When is your birthday?");
System.out.println(input);
	if(input.equals("6/16")) {
	JOptionPane.showMessageDialog(null, "Happy Birthday! :)");
}
	else {
	JOptionPane.showMessageDialog(null, "Have a very merry UNbirthday!");
}
}
}

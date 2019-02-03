package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	

	public static void main(String[] args) {

		String sNickels = JOptionPane.showInputDialog("How many nickels do you have?");
		double iNickels = Integer.parseInt(sNickels);
		iNickels = iNickels * .05;
		
		String sQuarters = JOptionPane.showInputDialog("How many quarters do you have?");
		double iQuarters = Integer.parseInt(sQuarters);
		iQuarters = iQuarters * .25;
		
		String sDimes = JOptionPane.showInputDialog("How many dimes do you have?");
		double iDimes = Integer.parseInt(sDimes);
		iDimes = iDimes * .1;
		
		String sPennies = JOptionPane.showInputDialog("How many pennies do you have?");
		double iPennies = Integer.parseInt(sPennies);
		iPennies = iPennies * .01;
		
		double money = iPennies + iNickels + iDimes + iQuarters;
		JOptionPane.showMessageDialog(null, "You have "+money+"$ in your pocket.");
	}
}


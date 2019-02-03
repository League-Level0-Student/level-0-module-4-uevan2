package doubles_and_booleans;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

class TestScores {
	
	public static void main(String[] args) {
		
		String testScore = JOptionPane.showInputDialog("what is your test score in percent? (no extra credit)");
	
		if(testScore.equals("E")) {
			JOptionPane.showMessageDialog(null, "nice");
			System.exit(0);
		}
		
		double score = Integer.parseInt(testScore);
		
		if(score<0) {
			JOptionPane.showMessageDialog(null, "lies");
		}
		
		else if(score==42) {
			JOptionPane.showMessageDialog(null, "👼");
		}
		
		else if(score==69) {
			JOptionPane.showMessageDialog(null, "lmao");
		}
		
		else if(score<60) {
			JOptionPane.showMessageDialog(null, "F");
		}
		
		else if(score<70) {
			JOptionPane.showMessageDialog(null, "oof");
		}
		
		else if(score<80) {
			JOptionPane.showMessageDialog(null, "RIP");
		}
		
		else if(score<90) {
			JOptionPane.showMessageDialog(null, "bad");
		}
		
		else if(score<100) {
			JOptionPane.showMessageDialog(null, "still bad");
		}
		
		else if(score==100) {
			JOptionPane.showMessageDialog(null, "meh");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "more lies");
		}
			
	
	}
}

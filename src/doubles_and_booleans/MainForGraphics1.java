package doubles_and_booleans;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class MainForGraphics1
{
public static void main(String[] args)
{

JFrame frame = new JFrame();


frame.setSize(1920,1080);


frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


SleepyHead panel = new SleepyHead();
   

frame.add(panel);

frame.setVisible(true);


}
}



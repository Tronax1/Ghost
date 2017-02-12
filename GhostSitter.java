import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.net.*;
import java.io.*;

public class GhostSitter {
	public static void main(String[] args)throws MalformedURLException {
		Scanner scan = new Scanner(System.in);

		Ghost slimer = new Ghost();

		int choice;
		do {
			System.out.println("Ghost Sitter\n");
			System.out.println("0 - Quit");
			System.out.println("1 - Converse with your ghost");
			System.out.println("2 - Offer a candy sacrifice to your ghost");
			System.out.println("3 - Try and scare your ghost");
         System.out.println("4 - Selfie of the ghost");

			System.out.println("Enter your choice");

			choice = scan.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Good bye.");
				break;
			case 1:
				slimer.speakWithTheSpirits();
				System.out.println("My hunger level is " + slimer.getHunger() + " and my spookieness level is "
						+ slimer.getSpookiness() + ".");
				slimer.passTime();
				break;
			case 2:
				slimer.eatCandy();
				System.out.println("My hunger level is " + slimer.getHunger() + " and my spookieness level is "
						+ slimer.getSpookiness() + ".");
				slimer.passTime();
				break;
			case 3:
				slimer.scare();
				System.out.println("My hunger level is " + slimer.getHunger() + " and my spookieness level is "
						+ slimer.getSpookiness() + ".");
				slimer.passTime();
				break;
            
            //Ghosts also take selfies
          case 4:
            URL url = new URL("http://www.netanimations.net/AnimatedGhost1.gif");
            Icon icon = new ImageIcon(url);
            JLabel label = new JLabel(icon);
            JFrame f = new JFrame("Animation");
            f.getContentPane().add(label);
            f.pack();
            f.setLocationRelativeTo(null);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            break;
			   default:
				System.out.println("Sorry, the choice you made " + choice + " is not a valid choice.");
			}
		} while (choice != 0);
     
	}
}



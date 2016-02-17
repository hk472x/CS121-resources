import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

/**
 * A starting point for creating a new graphical program
 * @author CS121 instructors
 */
public class BlankCanvas extends JPanel
{
	/**
	 * Draws the picture in the panel. This is where all of your
	 * code will go.
	 * @param page Our graphics canvas.
	 */
	public void paintComponent (Graphics page)
	{
	    final Color PURPLE = new Color(179, 51, 222);
	    
	      page.drawLine(0, 0, 800, 600);
	      
	      page.setColor(PURPLE);
	      
	      page.drawRect(300, 200, 300, 200);
	      
	      page.fillOval(300, 200, 300, 200);
	      
	      page.setColor(Color.white);
	      
	      page.fillArc(350, 250, 200, 100, 180, 180);
	      
	}


	/**
	* Constructor (panel initialization)
	*/
	public BlankCanvas()
	{
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(800, 600));
	}


	/**
	* Sets up a JFrame and the BlankCanvas panel.
	* @param args unused
	*/
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("BlankCanvas");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new BlankCanvas());
		frame.pack();
		frame.setVisible(true);
	}
}

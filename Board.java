package candy;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Board {
	public void create_board(int width, int height){
		JFrame frame = new JFrame("Restcue Pets");
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void decorate(Graphics g){
		Graphics2D graphic_2 =  (Graphics2D) g;
		graphic_2.setColor(Color.red);
		graphic_2.fillOval(0, 0, 30, 30);
		graphic_2.drawOval(0, 50, 30, 30);		
		graphic_2.fillRect(50, 0, 30, 30);
		graphic_2.drawRect(50, 50, 30, 30);

		graphic_2.draw(new Ellipse2D.Double(0, 100, 30, 30));
	}
}


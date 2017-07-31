package javatutorial.net;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrmaeGraphics extends JPanel{

	Graphics g;
	void drawLine(){
		g.drawLine(10, 10, 200, 200);
	} 
	
	void drawCircle(){
		g.drawOval(100, 100, 100, 100);	
	}
	
	void drawRectangle(){
		g.drawRect(50, 50, 100, 100);
	}
	
	void drawPolygon(){
		int xValues[] = {25, 145, 25, 145, 25};
	    int yValues[] = {25, 25, 145, 145, 25};
	    int points = 5;	    
	    g.drawPolygon(xValues, yValues, points);
	}
	
	void drawString(){	
		g.drawString("Hello to JavaTutorial.net", 50, 100);
	}	
	
	void drawImage(){	
	 	Image image = Toolkit.getDefaultToolkit().getImage("example.jpg");
		g.drawImage(image, 10, 10, this);
	}
	
	public void paint(Graphics g){
		drawImage();
	}
	
	public static void main(String[] args){
		JFrame frame= new JFrame("JavaTutorial.net");	
		frame.getContentPane().add(new JFrmaeGraphics());
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);		
	}
}




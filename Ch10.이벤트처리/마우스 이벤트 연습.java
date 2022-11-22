package eventstudy;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Event extends JFrame{
	private JLabel la=new JLabel("Hello");
	public Event() {
		setTitle("Mouse Event EX");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.addMouseListener(new MyMouseListener());
		c.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30,30);
		c.add(la);
		
		setSize(250,250);
		setVisible(true);
	}
	private class MyMouseListener implements MouseListener{
		public void mousePressed(MouseEvent e) {
			int x=e.getX();
			int y=e.getY();
			la.setLocation(x, y);
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		new Event();
	}

}

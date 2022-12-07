import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Event extends JFrame{
	private JLabel la= new JLabel("HELLO");
	private final int FlyingUnit=10;
	public Event() {
		setTitle("Hello EX");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());
		
		la.setLocation(50,50);
		la.setSize(100,20);
		c.add(la);
		
		setSize(300,300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component com=(Component)e.getSource();
				com.setFocusable(true);
				com.requestFocus();
			}
		});
	}
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode=e.getKeyCode();
			
			switch(keyCode) {
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY()-FlyingUnit);
				break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY()+FlyingUnit);
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX()-FlyingUnit, la.getY());
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX()+FlyingUnit, la.getY());
				break;
			}
		}
	
	}

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		new Event();
	}

}

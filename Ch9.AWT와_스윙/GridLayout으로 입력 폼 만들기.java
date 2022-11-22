package javastudy;
import java.awt.*;
import javax.swing.*;

public class Swing extends JFrame{
	
	public Swing() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid=new GridLayout(4,2);
		grid.setVgap(5);
		
		Container c=getContentPane();
		c.setLayout(grid);
		c.add(new JLabel(" 이름"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학과"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 과목"));
		c.add(new JTextField(""));
		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		new Swing();
	}

}

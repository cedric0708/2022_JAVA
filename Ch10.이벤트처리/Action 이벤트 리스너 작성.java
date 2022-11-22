package eventstudy;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Event extends JFrame{
	public Event() {
		setTitle("Action Event Listener EX");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn=new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		new Event();
	}

}

class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
	}
}
ㅁ

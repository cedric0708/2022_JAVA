package threadstudy;
import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread{
	private JLabel timerlabel;
	
	public TimerThread (JLabel timerlabel) {
		this.timerlabel=timerlabel;
	}
	
	public void run() {
		int n=0;
		while(true) {
			timerlabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class Threadstudy extends JFrame {
	
	
	public Threadstudy() {
		setTitle("Thread Timer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerlabel=new JLabel();
		timerlabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerlabel);
		
		TimerThread th=new TimerThread(timerlabel);
		
		setSize(300,170);
		setVisible(true);
		th.start();
	}

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		new Threadstudy();
	}

}

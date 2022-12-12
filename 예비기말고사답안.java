import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyLabel extends JLabel {
	private int barSize = 0; 
	private int maxBarSize; 
	
	public MyLabel(int maxBarSize) { 
		this.maxBarSize = maxBarSize;
	}
	
	public MyLabel (int bS, int mBS) {
		barSize = bS;
		maxBarSize = mBS;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		int width = (int) (((double)(this.getWidth()))/maxBarSize*barSize);
		if (width==0) 
			return; 
		g.fillRect(0, 0, width, this.getHeight());
	}
	
	synchronized public void fill() {
		if(barSize == maxBarSize) {
			try {
				wait(); 
			} catch (InterruptedException e) { return; }
		}
		barSize++;
		repaint(); 
		notify(); 
	}
	synchronized public void consume() {
		if(barSize == 0) {
			try {
				wait(); 
			} catch (InterruptedException e) { return; }
		}
		barSize--;
		repaint(); 
		notify(); 
	}
}

class ConsumerThread implements Runnable {
	private MyLabel bar;
	private int interval;
	private int myAction = 1;  // 1 = consume, 2 = fill
	
	private String mName;
	private Thread mThread;
	private boolean myStop = false;
	private boolean myPause = false;
	
	
	public ConsumerThread(MyLabel bar) {
		this.bar = bar;
		interval = 200;
	}
	
	
	public ConsumerThread(MyLabel bar, int itv, String tName, int myA) {
		this.bar = bar;
		interval = itv;
		mName = tName;
		myAction = myA;
	}
	
	@Override
	public void run() {
		try {
			while(myStop == false) {
				synchronized (this) {
					while (myPause == true) {
						wait();
					}
				}
				Thread.sleep(interval);
				switch (myAction) {
					case 1 :
						bar.consume(); 
						break;
					case 2 :
						bar.fill();
						break;
					default: // default is consume
						bar.consume();
						break;
				}
				
			}
			
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
		}
	}
	
    public void start() {
        if(mThread == null) {
            mThread = new Thread(this, mName);
            mThread.start();
        }
    }
    
    public void stop() {
        myStop = true;
    }
 
    public void pause() {
        myPause = true;
    }
 
    synchronized public void resume() {
        myPause = false;
        notify();
    }
}

public class TabAndThread2 extends JFrame {
	private MyLabel bar = new MyLabel(100); 
	private MyLabel bar2 = new MyLabel (100, 100);
	
	private ConsumerThread cth1, cth2, fth1, fth2;
	
	public TabAndThread2(String title) {
		super("Student number and Name here");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Container c = getContentPane();
		c.setLayout(null);
		bar.setBackground(Color.ORANGE);
		bar.setOpaque(true);
		bar.setLocation(20,  50);
		bar.setSize(300, 20); 
		c.add(bar);

		bar2.setBackground(Color.ORANGE);
		bar2.setOpaque(true);
		bar2.setLocation(20,  100);
		bar2.setSize(300, 20); 
		c.add(bar2);
		
		
		
		
		c.addKeyListener(new MyKeyListener());
				
		setSize(350,200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus(); 
		
		fth1 = new ConsumerThread(bar,100,"FThread1", 2); 
		fth1.start();
		cth1 = new ConsumerThread(bar, 200, "CThread1", 1); 
		cth1.start();
				
		cth2 = new ConsumerThread(bar2,100,"CThread2", 1); 
		cth2.start(); 
		fth2 = new ConsumerThread(bar2, 200, "FThread2", 2);
		fth2.start();
			

	}
	
	class MyKeyListener extends KeyAdapter {
		private int flag = 1;
		
		public void keyPressed(KeyEvent e) {
			// Container contentPane = (Container)e.getSource();
			
			switch (e.getKeyChar()) {
				case '1' :
					fth1.pause();
					cth1.pause();
					cth2.pause();
					fth2.pause();
					flag = 2;
					break;
				case '2' :
					fth1.resume();
					cth1.resume();
					cth2.resume();
					fth2.resume();
					flag = 1;
					break;
				default : 
					break;
			}
		}
	}
	
	public static void main(String[] args) {
		new TabAndThread2("21011905 KimGwanYeop");
	}
}

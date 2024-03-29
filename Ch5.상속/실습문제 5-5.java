import java.util.*;

class Point {
	private int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	protected void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
}

class ColorPoint extends Point {
	   private String color;
	   public ColorPoint(int x, int y, String color) {
	      super(x, y);
	      this.color = color;
	   }
	   public void setXY(int x, int y){
	         move(x, y);
	   }
	   public void setColor(String color){
	      this.color = color;
	   }
	   public String toString() {
	      String tmp = color+"색의"+" ("+getX()+","+getY()+")의 점";
	      return tmp;
	   }
	}

public class java_5_5 extends Point{

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		ColorPoint cp=new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str=cp.toString();
		System.out.println(str+ "입니다.");
	}

}

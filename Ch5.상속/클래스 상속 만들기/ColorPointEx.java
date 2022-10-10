public class ColorPointEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Point p=new Point();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp=new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
	}

}

/* 출력 결과

(1,2)
red(3,4)

*/

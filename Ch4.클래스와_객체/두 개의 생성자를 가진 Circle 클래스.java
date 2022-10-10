public class Circle {
	
	int radius;
	String name;
	
	public Circle() {
		radius=1; name="";
	}
	
	public Circle(int r, String n) {
		radius=r; name=n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Circle pizza=new Circle(10, "자바피자");
		double area=pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut=new Circle();
		donut.name="도넛피자";
		area=donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}

}
/*
출력 결과

자바피자의 면적은 314.0
도넛피자의 면적은 3.14

*/

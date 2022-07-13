/*
문제

두 사람이 하는 강위바위보 게임을 만들어보자. 두 사람의 이름은 '철수'와 '영희' 이다. 먼저 "철수 >>"를 출력하고 "가위", "바위", "보" 중 하나를
문자열로 입력받는다. 그리고 "영희 >>"를 출력하고 마찬가지로 입력받는다. 입력받은 문자열을 비교하여 누가 이겼는지 판별하여 승자를 출력한다.

*/

import java.util.Scanner;
public class InAndOut {
	public static void main(String args[]) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner scanner=new Scanner(System.in);//입력 부분
		
		String name=scanner.next();
		System.out.print("이름은 " + name + ", ");
		
		String city=scanner.next();
		System.out.print("도시는 " + city + ", ");
		
		int age=scanner.nextInt();
		System.out.print("나이는 " + age + "살, ");
		
		double weight=scanner.nextDouble();
		System.out.print("체중은 " + weight + "kg, ");
		
		boolean isSingle=scanner.nextBoolean();
		System.out.println("독신 여부는 " + isSingle + "입니다.");
		scanner.close();
	}
}

/*
실행 결과

이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요
Kim Seoul 20 65.1 true
이름은 Kim, 도시는 Seoul, 나이는 20살, 체중은 65.1kg, 독신 여부는 true입니다.

*/

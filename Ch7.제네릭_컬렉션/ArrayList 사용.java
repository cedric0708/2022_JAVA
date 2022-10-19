import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		ArrayList<String> a=new ArrayList<String>();
		
		Scanner scanner=new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.print("이름을 입력하세요>>");
			String s=scanner.next();
			a.add(s);
		}
		
		for(int i=0; i<a.size(); i++) {
			String name=a.get(i);
			System.out.print(name + " ");
		}
		
		int longestIndex=0;
		for(int i=1; i<a.size(); i++) {
			if(a.get(i).length()>a.get(longestIndex).length()) {
				longestIndex=i;
			}
		}
		System.out.print("\n가장 긴 이름은 : "+a.get(longestIndex));
		scanner.close();
		
	}

}

/* 출력 결과

이름을 입력하세요>>Mike
이름을 입력하세요>>Jane
이름을 입력하세요>>Ashley
이름을 입력하세요>>Helen
Mike Jane Ashley Helen 
가장 긴 이름은 : Ashley

*/

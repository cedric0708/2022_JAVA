import java.util.*;

public class CollectionsEx {
	
	static void printList(LinkedList<String> l) {
		var i=l.iterator();
		while(i.hasNext()) {
			String e=i.next();
			String sp;
			if(i.hasNext()) {
				sp="->";
			}
			else {
				sp="\n";
			}
			System.out.print(e+sp);
		}
	}
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		var myList=new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0, "터미네이터");
		myList.add(2, "아바타");
		
		Collections.sort(myList);
		printList(myList);
		
		Collections.reverse(myList);
		printList(myList);
		
		int index=Collections.binarySearch(myList, "아바타")+1;
		System.out.println("아바타는 "+index+"번째 요소입니다.");
	}

}

/* 출력 결과

매트릭스->스타워즈->아바타->터미네이터->트랜스포머
트랜스포머->터미네이터->아바타->스타워즈->매트릭스
아바타는 3번째 요소입니다.

*/

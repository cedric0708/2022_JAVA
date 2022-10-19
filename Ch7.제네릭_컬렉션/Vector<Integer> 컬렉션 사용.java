import java.util.*;

public class VectorEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Vector<Integer> v=new Vector<Integer>();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2, 100);
		
		System.out.println("벡터의 요소의 개수 : " + v.size());
		System.out.println("벡터의 용량 : " + v.capacity());
		
		for(int i=0; i<v.size(); i++) {
			int n=v.get(i);
			System.out.println(n);
		}
		
		int sum=0;
		
		for(int i=0; i<v.size(); i++) {
			int n=v.get(i);
			sum+=n;
		}
		System.out.println("벡터에 있는 정수 합 : "+ sum);
	}

}

/* 출력 결과

벡터의 요소의 개수 : 4
벡터의 용량 : 4
5
4
100
-1
벡터에 있는 정수 합 : 108

*/

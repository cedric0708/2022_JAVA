import java.util.*;

public class java_3_5 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc=new Scanner(System.in);
		int array[]=new int[10];
		int n;
		
		System.out.print("양의 정수 10개를 입력하시오>>");
		for(int i=0; i<10; i++) {
			n=sc.nextInt();
			array[i]=n;
		}
		System.out.print("\n3의 배수는");
		for(int i=0; i<10; i++) {
			if(array[i]%3==0) {
				System.out.print(" "+array[i]);
			}
		}
		sc.close();
	}

}

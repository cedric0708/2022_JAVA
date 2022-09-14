public class foreach{
  enum Week { 월,화,수,목,금,토,일 }
  
  public static void main(String[] args){
    String names[] = {"사과", "배", "바나나", "포도"};
    int [] n = {1,2,3,4,5};
    int sum=0;
    
    for(int k:n){
      System.out.print(k+ " ");
      sum+=k;
    }
    System.out.println("합은" + sum);
    
    for(String s : names)
      System.out.print(s + " ");
    System.out.println();
    
    for(Week day : Week.values())
      System.out.print(day + "요일 ");
    System.out.println();
  }
}

/* 실행 결과
1 2 3 4 5 합은 15
사과 배 바나나 포도
월요일 화요일 수요일 목요일 금요일 토요일 일요일
*/
